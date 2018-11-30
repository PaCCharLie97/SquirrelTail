package com.squirrelTail.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.squirrelTail.models.Bar;
import com.squirrelTail.persistencia.BarManager;


@WebServlet("/principal")
public class PgPrincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			List<Bar> listabar = BarManager.getInstance().dameTodosLosBares();

			System.out.println("bares:" + listabar);

			request.setAttribute("lista_bares", listabar);
			
			System.out.println("baresx!!!");
		} catch (Exception e) {
			request.setAttribute("error", "opppsssss ....");

			e.printStackTrace();
		}

		request.getRequestDispatcher("/pgprincipal.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
