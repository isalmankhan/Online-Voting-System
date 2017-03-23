package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.securevoting.bean.LoginBean;

public class SecureVotingLogin extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean b;
		LoginBean loginBean = new LoginBean();
		loginBean.setNssn((String) request.getParameter("nssn"));
		loginBean.setVoteid((String) request.getParameter("voterid"));
		//System.out.println("----------------------");
		b = loginBean.validateLogin();

		if (b == true) {
			System.out.println("Login successfully");
			RequestDispatcher rd = request.getRequestDispatcher("/html/partydesc.html");
			rd.forward(request, response);
		} else {
			out.println("login failed");
		}
		out.flush();
		out.close();

	}
}
