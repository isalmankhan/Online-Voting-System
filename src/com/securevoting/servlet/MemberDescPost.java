package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.MemberDescPostbean;

public class MemberDescPost extends HttpServlet {

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
		MemberDescPostbean memberdescpostbean = new MemberDescPostbean();
		memberdescpostbean.setAge(request.getParameter("age"));
		memberdescpostbean.setBirthplace(request.getParameter("birth"));
		memberdescpostbean.setEduction(request.getParameter("eduction"));
		memberdescpostbean.setName(request.getParameter("name"));
		memberdescpostbean.setParticipatingplace(request.getParameter("place"));
		memberdescpostbean.setPolicerecord(request.getParameter("police"));
		memberdescpostbean.setPost(request.getParameter("post"));
		memberdescpostbean.setPropertyvalue(request.getParameter("value"));
		
		HttpSession session = request.getSession(true);
		memberdescpostbean.setPartyname((String)session.getAttribute("partyname"));
		System.out.println("partyname is--->"+(String)session.getAttribute("partyname"));
		
		int k = memberdescpostbean.memberData();
		if(k==1)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/html/membersdesc.html");
			rd.forward(request, response);
		}
		else
		{
			out.println("problem while storing the member details in the database");
		}	
		
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

}
