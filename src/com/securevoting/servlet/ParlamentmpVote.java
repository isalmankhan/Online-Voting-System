package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.ParlamentmpVotebean;

public class ParlamentmpVote extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ParlamentmpVotebean pmpvote = new ParlamentmpVotebean();
		pmpvote.setVoterid(request.getParameter("voterid"));
		String div = request.getParameter("division");
		pmpvote.setDivision(div);
		HttpSession session = request.getSession(true);
		session.setAttribute("division",div);
		boolean b = pmpvote.getUserDivision();
		if(b==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/uservoteforMP.jsp");
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
