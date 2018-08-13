package org.play.ground.atomic;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.play.ground.atomic.data.Employee;
import org.play.ground.atomic.data.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{

    public void insertEmployee() {
        Employee fordFocus = new Employee("Nicolas", "Martinez");
        Employee hondaCivic = new Employee("Mati", "Martinez");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(fordFocus);
        session.save(hondaCivic);
        tx.commit();
    }

    public static void main( String[] args )
    {
        System.out.println( "Start" );

        App app = new App();
        app.insertEmployee();

        HibernateUtil.shutdown();
    }

}
