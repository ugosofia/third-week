package com.corso.java.hibernate.studente;


import com.corso.java.hibernate.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DepartmentTest {
    private SessionFactory sessionFactory;

    public static void main(String arg[]) throws Exception {
        DepartmentTest test = new DepartmentTest();
        test.setUp();
        test.testBasicUsage();
        test.shutDown();
    }

    protected void setUp() throws Exception {
        sessionFactory = new Configuration()
                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
                .buildSessionFactory();
    }

    protected void shutDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void testBasicUsage() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Student(1023, "ugo", "Sofia", 1));
        session.save(new Department(1, "informatica"));
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from com.corso.java.hibernate.studente.Student").list();
        for (Student student : (List<Student>) result) {
            System.out.println("Student (" + student.getId() + ") : " + student.getName() + "  " + student.getLastname() + " " + student.getIdDepartment() );
        }
        session.getTransaction().commit();
        session.close();
    }
}
