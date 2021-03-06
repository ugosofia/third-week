package com.corso.java.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class EventTest {
    private SessionFactory sessionFactory;

    public static void main(String arg[]) throws Exception {
        EventTest test = new EventTest();
        test.setUp();
        test.testBasicUsage();
        test.shutDown();
    }

    public void setUp() throws Exception {
        sessionFactory = new Configuration()
                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
                .buildSessionFactory();
    }

    public void shutDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void testBasicUsage() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Event());
        session.save(new Event());
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from com.corso.java.hibernate.Event").list();
        for (Event event : (List<Event>) result) {
            System.out.println("Event (" + event.getDate() + ") : " + event.getTitle() + "  " + event.getDescription());
        }
        session.getTransaction().commit();
        session.close();
    }
}
