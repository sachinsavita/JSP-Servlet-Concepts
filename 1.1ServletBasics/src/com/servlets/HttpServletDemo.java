package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HttpServletDemo extends HttpServlet{
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		HttpServletDemo obj = new HttpServletDemo(); 
		obj.doPost(req, res);
		
		out.println("<h1>This is doGet() of HttpServletDemo!!!</h1>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.println("<h1>This is doPost() of HttpServletDemo!!!</h1>");
	}

}
