package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.AssemblymlaVotebean;

public class AssemblymlaVote extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
PrintWriter out = response.getWriter();
AssemblymlaVotebean asmvote = new AssemblymlaVotebean();
asmvote.setVoterid(request.getParameter("voterid"));
String vilge = request.getParameter("village");
asmvote.setVillage(vilge);
HttpSession session = request.getSession(true);
session.setAttribute("village",vilge);
boolean b = asmvote.getUserDivision();
if(b==true)
{
	RequestDispatcher rd = request.getRequestDispatcher("/jsp/uservoteforMLA.jsp");
	rd.forward(request, response);
}
else
{
	out.println("your division is not matching with the divison in the voterregistration");
}



}


public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doGet(request,response);
}

}

