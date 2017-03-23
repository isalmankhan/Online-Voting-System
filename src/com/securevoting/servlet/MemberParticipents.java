package com.securevoting.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.MemberParticipentsbean;

public class MemberParticipents extends HttpServlet {

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
		
		MemberParticipentsbean memberparticipentsbean = new MemberParticipentsbean();
		PrintWriter out = response.getWriter();
		
		memberparticipentsbean.setMpperson1(request.getParameter("mpperson1"));
		memberparticipentsbean.setMpplace1(request.getParameter("mpplace1"));
		memberparticipentsbean.setMppost1(request.getParameter("mppost1"));
		memberparticipentsbean.setMppersondesc1(request.getParameter("mppersondesc1"));
		
		memberparticipentsbean.setMpperson2(request.getParameter("mpperson2"));
		memberparticipentsbean.setMpplace2(request.getParameter("mpplace2"));
		memberparticipentsbean.setMppost2(request.getParameter("mppost2"));
		memberparticipentsbean.setMppersondesc2(request.getParameter("mppersondesc2"));
		
		memberparticipentsbean.setMpperson3(request.getParameter("mpperson3"));
		memberparticipentsbean.setMpplace3(request.getParameter("mpplace3"));
		memberparticipentsbean.setMppost3(request.getParameter("mppost3"));
		memberparticipentsbean.setMppersondesc3(request.getParameter("mppersondesc3"));
		
		memberparticipentsbean.setMlaperson1(request.getParameter("mlaperson1"));
		memberparticipentsbean.setMlaplace1(request.getParameter("mlaplace1"));
		memberparticipentsbean.setMlapost1(request.getParameter("mlapost1"));
		memberparticipentsbean.setMlapersondesc1(request.getParameter("mlapersondesc1"));
		
		memberparticipentsbean.setMlaperson2(request.getParameter("mlaperson2"));
		memberparticipentsbean.setMlaplace2(request.getParameter("mlaplace2"));
		memberparticipentsbean.setMlapost2(request.getParameter("mlapost2"));
		memberparticipentsbean.setMlapersondesc2(request.getParameter("mlapersondesc2"));
		
		memberparticipentsbean.setMlaperson3(request.getParameter("mlaperson3"));
		memberparticipentsbean.setMlaplace3(request.getParameter("mlaplace3"));
		memberparticipentsbean.setMlapost3(request.getParameter("mlapost3"));
		memberparticipentsbean.setMlapersondesc3(request.getParameter("mlapersondesc3"));
		
		memberparticipentsbean.setMlaperson4(request.getParameter("mlaperson4"));
		memberparticipentsbean.setMlaplace4(request.getParameter("mlaplace4"));
		memberparticipentsbean.setMlapost4(request.getParameter("mlapost4"));
		memberparticipentsbean.setMlapersondesc4(request.getParameter("mlapersondesc4"));
		
		memberparticipentsbean.setMlaperson5(request.getParameter("mlaperson5"));
		memberparticipentsbean.setMlaplace5(request.getParameter("mlaplace5"));
		memberparticipentsbean.setMlapost5(request.getParameter("mlapost5"));
		memberparticipentsbean.setMlapersondesc5(request.getParameter("mlapersondesc5"));
		
		memberparticipentsbean.setMlaperson6(request.getParameter("mlaperson6"));
		memberparticipentsbean.setMlaplace6(request.getParameter("mlaplace6"));
		memberparticipentsbean.setMlapost6(request.getParameter("mlapost6"));
		memberparticipentsbean.setMlapersondesc6(request.getParameter("mlapersondesc6"));
		
		memberparticipentsbean.setMlaperson7(request.getParameter("mlaperson7"));
		memberparticipentsbean.setMlaplace7(request.getParameter("mlaplace7"));
		memberparticipentsbean.setMlapost7(request.getParameter("mlapost7"));
		memberparticipentsbean.setMlapersondesc7(request.getParameter("mlapersondesc7"));
		
		memberparticipentsbean.setMlaperson8(request.getParameter("mlaperson8"));
		memberparticipentsbean.setMlaplace8(request.getParameter("mlaplace8"));
		memberparticipentsbean.setMlapost8(request.getParameter("mlapost8"));
		memberparticipentsbean.setMlapersondesc8(request.getParameter("mlapersondesc8"));
	
		memberparticipentsbean.setMlaperson9(request.getParameter("mlaperson9"));
		memberparticipentsbean.setMlaplace9(request.getParameter("mlaplace9"));
		memberparticipentsbean.setMlapost9(request.getParameter("mlapost9"));
		memberparticipentsbean.setMlapersondesc9(request.getParameter("mlapersondesc9"));
	
		memberparticipentsbean.setMlaperson10(request.getParameter("mlaperson10"));
		memberparticipentsbean.setMlaplace10(request.getParameter("mlaplace10"));
		memberparticipentsbean.setMlapost10(request.getParameter("mlapost10"));
		memberparticipentsbean.setMlapersondesc10(request.getParameter("mlapersondesc10"));
	
		memberparticipentsbean.setMlaperson11(request.getParameter("mlaperson11"));
		memberparticipentsbean.setMlaplace11(request.getParameter("mlaplace11"));
		memberparticipentsbean.setMlapost11(request.getParameter("mlapost11"));
		memberparticipentsbean.setMlapersondesc11(request.getParameter("mlapersondesc11"));
	
		memberparticipentsbean.setMlaperson12(request.getParameter("mlaperson12"));
		memberparticipentsbean.setMlaplace12(request.getParameter("mlaplace12"));
		memberparticipentsbean.setMlapost12(request.getParameter("mlapost12"));
		memberparticipentsbean.setMlapersondesc12(request.getParameter("mlapersondesc12"));
		System.out.println("success fully got the data from the html page");
		HttpSession session = request.getSession(true);
		memberparticipentsbean.setPartyname((String)session.getAttribute("ptname"));
		
		System.out.println("party name is--->"+session.getAttribute("ptname"));
		
		int i = memberparticipentsbean.memberDate();
		System.out.println("the i value is--->"+i);
		
		if(i==1)
		{
			RequestDispatcher rd = request.getRequestDispatcher("./jsp/members.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("problem while storing the partyname in the database");
		}
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
