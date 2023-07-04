package in.co.rays.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		UserModel model = new UserModel();
		try {
			UserBean bean = model.findByPK(Integer.parseInt(id));
			req.setAttribute("bn", bean);
			RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Op = req.getParameter("Operation");
		
		String id = req.getParameter("id");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		
		UserBean bean = new UserBean();
		
		if(Op.equals("Register"))
		{
		
			bean.setFirstName(firstName);
			bean.setLastName(lastName);
			bean.setLoginId(loginId);
			bean.setPassword(password);
			bean.setAddress(address);

			UserModel model = new UserModel();
			try {
				model.insertMethod(bean);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
		
		if(Op.equals("Update"))
		{

			bean.setId(Integer.parseInt(id));
			bean.setFirstName(firstName);
			bean.setLastName(lastName);
			bean.setLoginId(loginId);
			bean.setPassword(password);
			bean.setAddress(address);
			
			UserModel model = new UserModel();
			try {
				model.updateMethod(bean);
				resp.sendRedirect("UserListCtl.do");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
