package com.squirrelTail.persistencia;

import java.util.List;

<<<<<<< HEAD
import javax.security.auth.login.Configuration;
import javax.websocket.Session;

=======
import org.hibernate.Session;
>>>>>>> d85b73cd487ce35f6fbc2774b0742feb435b4a71
import org.hibernate.SessionFactory;

import com.squirrelTail.models.Bar;

public class BarManager{
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

	public List<Bar> dameTodosLosBares() throws Exception {
		List<Bar> bar = null;

		Session session = sf.openSession();

		bar = (session).createQuery("FROM Bar").list();

		session.close();
		return bar;
	}
	
	public Bar getBar(int bid) throws Exception {
		Session session = sf.openSession();

		Bar recB = session.get(Bar.class, bid);

		session.close();

		return recB;
	}

	public Bar getBarByBid(int bidInt) {
		////// crear metodoooo x dios
		return null;
	}
}
