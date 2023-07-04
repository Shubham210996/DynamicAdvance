package in.co.rays.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName =  "FrontController", urlPatterns = {"*.do","/UserListCtl"})
public class FrontController implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		if(session.getAttribute("firstname")== null) {
			req.setAttribute("msg", "Session Expired, Please Login Again...!!!");
			req.setAttribute("uri", uri);
			RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
			rd.forward(req, resp);
			
		}
		else {
			chain.doFilter(req, resp);
		}
		
	}
	
	@Override
	public void destroy() {
		
	}
}
