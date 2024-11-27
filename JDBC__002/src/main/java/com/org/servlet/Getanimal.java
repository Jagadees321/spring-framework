package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.AnimalCRUD;
@WebServlet("/ani")
public class Getanimal extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		int legs=Integer.parseInt(req.getParameter("legs"));
		int life=Integer.parseInt(req.getParameter("life"));
		
		PrintWriter pw= resp.getWriter();
		
		boolean res = AnimalCRUD.saveAnimal(name, legs, life);
		if(res) {
			pw.write("<h1>Animal data inserted successfully</h1>");
		}else {
			pw.write("<h1>Somthing went wrong!!!!!!!!!</h1>");
		}
	}

}
