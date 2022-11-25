package net.cqwu.ltf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class EncodeFilter implements Filter{

	public void destroy() {}
	public void init(FilterConfig arg0) throws ServletException {}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		    request.setCharacterEncoding("utf-8");
		    response.setCharacterEncoding("utf-8");
		    chain.doFilter(request, response);
		}


}
