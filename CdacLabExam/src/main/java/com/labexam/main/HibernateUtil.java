package com.labexam.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	public static SessionFactory sessionFact= null;

	public static void display()
	{
		
	
		try {
			Configuration configuration = new Configuration().configure();
			 sessionFact = configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFact;
		    }

	
}
