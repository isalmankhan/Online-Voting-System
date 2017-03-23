package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.securevoting.bean.AdminLoginbean;
import com.securevoting.bean.NssnRegistrationBean;

public class AdminLogin extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		boolean b;
		AdminLoginbean adlogin = new AdminLoginbean();
		adlogin.setUsername(request.getParameter("username"));
		adlogin.setPassword(request.getParameter("password"));
		b=adlogin.validateLogin();
		if (b == true) {
			System.out.println("Login successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/html/membersdesc.html");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/html/admin.html");
			rd.forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
doGet(request,response);
		
	}

}
