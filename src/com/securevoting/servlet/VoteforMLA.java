package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VoteforMLA extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
String personname = request.getParameter("mla");
HttpSession session = request.getSession(true);
session.setAttribute("personname",personname);
RequestDispatcher rd = request.getRequestDispatcher("/jsp/successvoteforMLA.jsp");
rd.forward(request, response);

}


public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doGet(request,response);
}

}


