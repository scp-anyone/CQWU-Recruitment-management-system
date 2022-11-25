package net.cqwu.ltf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class JAdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		if(session != null && session.getAttribute("adminuser") != null){
	        Adminuser adminuser = (Adminuser)session.getAttribute("adminuser");
	    if(“教务管理员".equals(adminuser.getAdmingroup())){
	        chain.doFilter(request, response);
	    }else{
	        req.setAttribute("adminLoginMess", "*请先登录！");
	        req.getRequestDispatcher("/manage.jsp").forward(request, response);
	    }
	}else

	{
		req.setAttribute("adminLoginMess", "*请先登录！");
		req.getRequestDispatcher("/manage.jsp").forward(request, response);
	}

}

}
