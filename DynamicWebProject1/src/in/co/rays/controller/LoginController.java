package in.co.rays.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = req.getParameter("Operation");
		
		
		if(op!=null && op.equalsIgnoreCase("logout")) {
			HttpSession session = req.getSession();
			session.invalidate();
			
		}
		RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String uri = req.getParameter("uri");
		UserModel model = new UserModel();
		try {
			UserBean bean = model.authenticate(loginId, password);
			if (bean != null) {
				System.out.println("User Valid");
				HttpSession session = req.getSession();
				session.setAttribute("firstname", bean.getFirstName());
				if(uri.equalsIgnoreCase("null"))
				{
					RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
					rd.forward(req, resp);
				}else {
					resp.sendRedirect(uri);
				}
			} else {
				System.out.println("User Invalid");
				req.setAttribute("key", "Invalid Username and Password");
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				rd.forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
