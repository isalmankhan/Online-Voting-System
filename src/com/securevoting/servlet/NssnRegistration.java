package com.securevoting.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.securevoting.bean.NssnRegistrationBean;

public class NssnRegistration extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		NssnRegistrationBean nssnreg = new NssnRegistrationBean();
		nssnreg.setFname(request.getParameter("fname"));
		nssnreg.setLname(request.getParameter("lname"));
		nssnreg.setGname(request.getParameter("gname"));
		nssnreg.setGender(request.getParameter("gender"));
		nssnreg.setDay(request.getParameter("day"));
		nssnreg.setMonth(request.getParameter("month"));
		nssnreg.setYear(request.getParameter("year"));
		nssnreg.setNationality(request.getParameter("nationality"));
		nssnreg.setOthers(request.getParameter("others"));
		nssnreg.setState(request.getParameter("state"));
		nssnreg.setDistict(request.getParameter("distict"));
		nssnreg.setMandal(request.getParameter("mandal"));
		nssnreg.setVillage(request.getParameter("village"));
		nssnreg.setHno(request.getParameter("hno"));
	HttpSession session = request.getSession(true);
	
		int i = nssnreg.validatenssn();
		
		if (i == 1) {
			
			System.out.println("nssnregistration successfully"+nssnreg.getNssn());
			session.setAttribute("nssnregistrationbean",nssnreg);
			ServletContext application = getServletContext();
			RequestDispatcher rd = application.getRequestDispatcher("/jsp/NssnRegistration.jsp");
			rd.forward(request, response);
			
		

		} 
		else 
		{
			out.println("nssnregistration failed ");
		}
		out.flush();
		out.close();
	}

}
