package org.playground.atomic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.play.ground.atomic.data.*;
import org.playground.atomic.data.Employee;
import org.playground.atomic.data.HibernateUtil;
import org.playground.atomic.data.pub.BlogPost;
import org.playground.atomic.data.pub.Book;
import org.playground.atomic.data.pub.Publication;

/**
 * Hello world!
 *
 */
public class App 
{

    private void insertEmployee() {
        Employee fordFocus = new Employee("Nicolas", "Martinez");
        Employee hondaCivic = new Employee("Mati", "Martinez");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(fordFocus);
        session.save(hondaCivic);
        tx.commit();
    }

    private void insertPublication() {
        Publication warAndPeace = new Book(1, "War And Peace", 100);
        Publication aMockingbird = new Book(1, "Killing A Mockingbird", 200);
        BlogPost blogPost = new BlogPost(1, "How to start a blog", "http://foo.blog");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(warAndPeace);
        session.save(aMockingbird);
        session.save(blogPost);
        tx.commit();
    }

    public static void main( String[] args )
    {
        System.out.println( "Start" );

        App app = new App();
//        app.insertEmployee();
        app.insertPublication();

        HibernateUtil.shutdown();
    }

}
