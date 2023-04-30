package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo implements Servlet {
	
	ServletConfig conf;

	@Override
	public void init(ServletConfig conf) throws ServletException {

		this.conf = conf;
		System.out.println("creating objects.....");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		System.out.println("servicing.......");
		
		//set the content type 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Response from ServeletDemo!!!</h1>");
		out.println("<h1>Todays date is: "+new Date().toString()+"</h1>");
	}
	

	//not life cycle method
	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	//not life cycle method
	@Override
	public String getServletInfo() {
		
		return null;
	}
	
	@Override
	public void destroy() {

		System.out.println("destroying......");
	}

}
