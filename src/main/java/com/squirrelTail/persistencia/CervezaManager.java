package com.squirrelTail.models.persistencia;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CervezaManager {
	private static CervezaManager instancia = null;
	private static SessionFactory sf = null;

	public static CervezaManager getInstance() throws Exception {
		if (instancia == null)
			instancia = new CervezaManager();

		return instancia;
	}

	private CervezaManager() throws Exception {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}


<<<<<<< HEAD
}
=======
}
>>>>>>> 8952cb3666f23ef1cfa3394585c8597b8cf11fec