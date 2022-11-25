package net.cqwu.ltf.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cqwu.ltf.dao.RecordDao;
import net.cqwu.ltf.dao.StuDao;
import net.cqwu.ltf.dao.impl.RecordDaoImpl;
import net.cqwu.ltf.dao.impl.StuDaoImpl;
import net.cqwu.ltf.util.Encrypt;
import net.cqwu.ltf.entity.Record;

public class StuLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		StuDao stuDao = new StuDaoImpl();
		RecordDao recordDao = new RecordDaoImpl();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String code = request.getParameter("code");
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("code", code);
//		String mess = validateForm(username, password, code);
		String mess=null;
		if (!"".equals(mess)) {
			request.setAttribute("stuLoginMess", mess);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			String sessioncode = session.getAttribute("sessioncode").toString();
			if (!code.equals(sessioncode)) {
				request.setAttribute("stuLoginMess", "* 验证码错误！");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else if (stuDao.validateLogin(username, Encrypt.SHA(password)) == null) {
				request.setAttribute("stuLoginMess", "* 用户名或密码输入错误！");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			} else {
				Record record = new Record();
				record.setLogname(username);
				record.setUsergroup("学生");
				record.setLogip(request.getRemoteAddr());
				if (recordDao.add(record) != 0) {
					session.setAttribute("username", username);
					response.sendRedirect(request.getContextPath() + "/stu/notice.jsp");
				} else {
					request.setAttribute("stuLoginMess", "* 登录异常！");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				}
			}
		}
	}

}
