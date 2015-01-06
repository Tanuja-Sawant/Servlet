package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class Login_Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	
    public Login_Servlet1() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "");
			System.out.println("connected..."+con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("txtusername");
		String password=request.getParameter("txtusername");
		if(isValid(username, password)) {
			request.getRequestDispatcher("ShowLogin").forward(request, response);
		}
		
		else {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private boolean isValid(String username, String password) {
		PreparedStatement pstat=null;
		ResultSet rs=null;

		return false;
	}

}
