package com.hetfdex.crm.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConnectionTester")
public class ConnectionTester extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/CRM?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "jose";
		String password = "Abcde12345!";

		try {
			PrintWriter output = response.getWriter();

			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url, user, password);

			output.println("Connected to MySQL database");

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}