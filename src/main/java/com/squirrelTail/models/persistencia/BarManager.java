package com.squirrelTail.models.persistencia;

import javax.servlet.http.HttpServlet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BarManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static BarManager instancia = null;
	private static SessionFactory sf = null;

	public static BarManager getInstance() throws Exception {
		if (instancia == null)
			instancia = new BarManager();

		return instancia;
	}
	
	private BarManager() throws Exception {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

}
