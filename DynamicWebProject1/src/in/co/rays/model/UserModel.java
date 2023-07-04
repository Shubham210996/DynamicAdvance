package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.UserBean;

public class UserModel { 
	public void insertMethod(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement ps = con1.prepareStatement("insert into sheetone values(?,?,?,?,?,?)");
		
		ps.setInt(1, nextPK());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getLoginId());
		ps.setString(5, bean.getPassword());
		ps.setString(6, bean.getAddress());
		
		int i = ps.executeUpdate();
		System.out.println("Data Inserted : "+i);
	}
	
	public void updateMethod(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement ps = con1.prepareStatement("update sheetone set firstname = ?, lastname = ?, loginId = ?, password = ?, address = ? where id = ?");
		
		
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());
		ps.setString(5, bean.getAddress());
		ps.setInt(6, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("Data Updated : "+i);
	}
	
	public void updateMethod() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("update sheetone set address='243, ward no 8, Lunhera Bujurg' where id = 1");
		System.out.println("Data Updated : "+i);
				
	}
	public void deleteMethod() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		Statement stmt = con1.createStatement();
		int i = stmt.executeUpdate("delete from sheetone where id = 0");
		System.out.println("Data Deleted : "+i);
				
	}
	public int nextPK() throws Exception {
		int pk=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement ps = con1.prepareStatement("select max(id) from sheetone");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
		pk = rs.getInt(1)+1;
		}
//		System.out.println(pk);
		return pk;
	}
	public List searchMethod() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		PreparedStatement ps = con1.prepareStatement("select * from sheetone");
		ResultSet rs = ps.executeQuery();
		ArrayList list= new ArrayList();
		while(rs.next()) {
			UserBean bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setAddress(rs.getString(6));
			list.add(bean);
		}
		 
		return list;
	}
	public UserBean authenticate (String loginId, String password) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement ps = con1.prepareStatement("select * from sheetone where loginId = ? and password = ?");
		
		ps.setString(1, loginId);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		UserBean bean = null;
		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setAddress(rs.getString(6));
			
		}
		return bean;
	}
	
	public UserBean findByPK (int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement ps = con1.prepareStatement("select * from sheetone where id = ?");
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		UserBean bean = null;
		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setAddress(rs.getString(6));
			
		}
		return bean;
	}
}
