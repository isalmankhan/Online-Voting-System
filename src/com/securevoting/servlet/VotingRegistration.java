package com.securevoting.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.VotingRegistrationBean;


public class VotingRegistration extends HttpServlet {

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		VotingRegistrationBean votingreg = new VotingRegistrationBean();
			int i;
		 votingreg.setNssn(request.getParameter("nssn"));
		 votingreg.setFname(request.getParameter("fname"));
		 votingreg.setLname(request.getParameter("lname"));
		 votingreg.setDay(request.getParameter("day"));
		 votingreg.setMonth(request.getParameter("month"));
		 votingreg.setYear(request.getParameter("Year"));
		 votingreg.setDivision(request.getParameter("division"));
		 votingreg.setVillage(request.getParameter("village"));
		 i = votingreg.validateVoting();
		 HttpSession session = request.getSession(true);
		 if(i==1)
		 {
			 out.println("votingregistration successfully");
			 session.setAttribute("votingregistrationbean",votingreg);
				ServletContext application = getServletContext();
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/VotingRegistration.jsp");
				rd.forward(request, response);
		 }
		 else 
		 {
			 out.println("votingregistration failed ");
		 }
		
	}

}
