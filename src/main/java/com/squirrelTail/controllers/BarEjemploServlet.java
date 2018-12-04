package com.squirrelTail.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squirrelTail.models.Bar;
import com.squirrelTail.persistencia.BarManager;
<<<<<<< HEAD
import com.squirrelTail.persistencia.CervezaManager;

@WebServlet("/barejemplo")
=======

>>>>>>> d85b73cd487ce35f6fbc2774b0742feb435b4a71
public class BarEjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bid = request.getParameter("bid");
		
		System.out.println(bid);

		
		try {
<<<<<<< HEAD
			int bidInt=Integer.parseInt(bid);
			
			Bar barejem=BarManager.getInstance().getBar(bidInt);
			
			request.setAttribute("unBar",barejem);
			
		}catch (Exception e) {
			System.out.println("Exception: "+ e.getMessage());
			request.setAttribute("error", "Ooopss...");
=======
			int bidInt = Integer.parseInt(bid);
			Bar miBar = BarManager.getInstance().getBarByBid(bidInt);

			request.setAttribute("unBar", miBar);

			request.getRequestDispatcher("/barejemplo.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			request.setAttribute("mensaje_error", "Ooops...intentalo más tarde");
>>>>>>> d85b73cd487ce35f6fbc2774b0742feb435b4a71
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
