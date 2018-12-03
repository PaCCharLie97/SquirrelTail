package com.squirrelTail.models;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {

	private static SessionFactory sf = null;

	@BeforeClass
	public static void createSessionFactory() {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Test
	public void testSession() {
		Session session = sf.openSession();

		assertNotNull(session);
	}
}
