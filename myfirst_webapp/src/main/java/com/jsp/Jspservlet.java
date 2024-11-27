package com.jsp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/testtest")
public class Jspservlet  extends GenericServlet{

	
	static {
		System.out.println("i am static");
	}
	{
		System.out.println("i am non static");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("i am service");
		int i=10;
		PrintWriter pw=res.getWriter();
		pw.write("<h1>"+i+"</h1>");
		
	}

}
