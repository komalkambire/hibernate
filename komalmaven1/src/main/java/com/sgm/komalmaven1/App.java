package com.sgm.komalmaven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello hibernate World!" );
        Configuration cf=new Configuration();
        cf.configure("hibernate.cfg.xml");
        cf.addAnnotatedClass(Place.class);
       
        SessionFactory sf=cf.buildSessionFactory();
        Session s1=sf.openSession();
       
        Place p1=new Place();
        p1.setId(1);
        p1.setName("karad");
        p1.setFare(100000);
        s1.beginTransaction();
        s1.save(p1);
        s1.getTransaction().commit();
        s1.close();
        System.out.println("one data saved in Place Table");
    }
}



