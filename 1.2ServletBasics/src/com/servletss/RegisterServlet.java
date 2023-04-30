package com.servletss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		try
		{

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h1>Welcome to Register Servlet</h>"); 
			String name = req.getParameter("user_name");
			String password = req.getParameter("user_password");
			String email = req.getParameter("user_email");
			String gender = req.getParameter("user_gender");
			String course = req.getParameter("user_course");
			String cond = req.getParameter("condition");
			
			System.out.println(cond);
			
			if(!cond.equals(null))
			{
				out.println("<h2>Name: "+name+"</h2>");
				out.println("<h2>Name: "+password+"</h2>");
				out.println("<h2>Name: "+email+"</h2>");
				out.println("<h2>Name: "+gender+"</h2>");
				out.println("<h2>Name: "+course+"</h2>");
				out.println("<h2>Name: "+cond+"</h2>");
				
				//saved to DB aasume
				
				//To forward to a servlet
				RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
				rd.forward(req, res);
				
			}
			else
			{
				out.println("<h1>You have not accepted the terms and condtions!</h1>");
				
				//use of include method by RequestDispatcher to include response of other servlets
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
			}
			
		}
		catch (NullPointerException e) {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h1>You have not accepted the terms and condtions!</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}

}
