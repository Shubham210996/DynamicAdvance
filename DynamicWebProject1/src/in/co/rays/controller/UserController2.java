package in.co.rays.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
@WebServlet("/UserController2")
public class UserController2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/htm");
		PrintWriter out = resp.getWriter();
		out.print("<h1>UserController doGet() method </h1>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		
		UserBean bean1 = new UserBean();
		bean1.setFirstName(firstName);
		bean1.setLastName(lastName);
		bean1.setLoginId(loginId);
		bean1.setPassword(password);
		bean1.setAddress(address);
		
		UserModel model = new UserModel();
		try {
			model.insertMethod(bean1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		PrintWriter out = resp.getWriter();
		out.print(firstName+" "+lastName+" "+loginId+" "+password+" "+address);
	}
}
