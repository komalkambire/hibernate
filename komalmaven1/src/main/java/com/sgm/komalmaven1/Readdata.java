package com.sgm.komalmaven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Readdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Place.class);
		
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session s1=sf.openSession();
		s1.beginTransaction();
		Place e1=s1.get(Place.class, 1);
	
		
	
		s1.getTransaction().commit();
		s1.close();
		System.out.println("reading db");
		System.out.println(e1);
	}

}
