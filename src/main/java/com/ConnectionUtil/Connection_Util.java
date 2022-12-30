package com.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Connection_Util {

	public static Connection getConnection() {
		Connection con= null;
		/*
		 * try {
		 * 
		 * InitialContext context = new InitialContext(); DataSource ds = (DataSource)
		 * context.lookup("java:comp/env/my"); con=ds.getConnection(); } catch
		 * (NamingException e) {
		 * 
		 * } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		try {
			System.out.println("Done");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("2");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coupon", "root", "root");
			 System.out.println("3");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
	}
}
