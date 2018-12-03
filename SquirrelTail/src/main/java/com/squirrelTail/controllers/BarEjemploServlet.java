package com.squirrelTail.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squirrelTail.models.Bar;
import com.squirrelTail.persistencia.BarManager;


public class BarEjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			
			
			List<Bar> unBar = BarManager.getInstance().dameTodosLosBares();
			
			request.setAttribute("unBar",unBar);
			
		}catch (Exception e) {
			System.out.println("Exception: "+ e.getMessage());
			request.setAttribute("error", "Ooopss...");
		}
		
		request.getRequestDispatcher("/barejemplo.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
