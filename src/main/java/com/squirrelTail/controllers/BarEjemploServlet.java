package com.squirrelTail.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andresbank.dao.CuentaDAO;
import com.ricardo.models.Employee;
import com.ricardo.persistencia.EmployeeManager;
import com.squirrelTail.models.Bar;
import com.squirrelTail.persistencia.BarManager;
import com.squirrelTail.persistencia.CervezaManager;

@WebServlet("/barejemplo")
public class BarEjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bid=request.getParameter("bid");
		
		try {
			int bidInt=Integer.parseInt(bid);
			
			Bar barejem=BarManager.getInstance().getBar(bidInt);
			
			request.setAttribute("unBar",barejem);
			
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
