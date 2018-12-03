package com.squirrelTail.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squirrelTail.models.Bar;
import com.squirrelTail.persistencia.BarManager;

public class BarEjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bid = request.getParameter("bid");
		
		System.out.println(bid);

		
		try {
			int bidInt = Integer.parseInt(bid);
			Bar miBar = BarManager.getInstance().getBarByBid(bidInt);

			request.setAttribute("unBar", miBar);

			request.getRequestDispatcher("/barejemplo.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			request.setAttribute("mensaje_error", "Ooops...intentalo más tarde");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
