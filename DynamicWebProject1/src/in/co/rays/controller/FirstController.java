package in.co.rays.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/FirstController","/Shubham"})
public class FirstController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("First Controller's doGet Method");
		String loginId = req.getParameter("firstName");
		String password = req.getParameter("password");
		String [] address = req.getParameterValues("address");
//		resp.sendRedirect("SecondController");
		System.out.println(loginId);
		System.out.println(password);
		System.out.println(address[0]);
		System.out.println(address[1]);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("First Controller's doPost Method");
//		resp.sendRedirect("SecondController");
	}
}
