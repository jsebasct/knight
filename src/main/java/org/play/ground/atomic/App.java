package org.play.ground.atomic;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.play.ground.atomic.data.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final SessionFactory SESSION_FACTORY;

    static {
        InputStream resourceAsStream = App.class.getClassLoader()
                .getResourceAsStream("hibernate.cfg.xml");
        Configuration config = new Configuration();

        java.util.Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        classLoader.getResource("filename");

//        InputStream inputStream = this.getClass().getClassLoader().
//                getResourceAsStream("hibernate-mysql.properties");

        config.setProperties(properties);

        config.configure();

        // Create StandardServiceRegistryBuilder using the properties.
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder.applySettings(properties);

        // Build a ServiceRegistry
        ServiceRegistry registry = builder.build();

        // Create the SessionFactory using the ServiceRegistry
        SESSION_FACTORY = config.buildSessionFactory(registry);
    }

    public static void main( String[] args )
    {
        System.out.println( "Start" );

        // Create two Students
        create(1, "Alice", 22); // Alice will get an id 1
//        create(2, "Bob", 20); // Bob will get an id 2
//        create(3, "Charlie", 25); // Charlie will get an id 3
//
//        // Update the age of Bob using the id
//        upate(2, "Bob", 25);
//
//        // Delete the Alice from database
//        delete(1);
//
//        // Print all the Students
//        List<Student> students = readAll();
//        if (students != null) {
//            for (Student stu : students) {
//                System.out.println(stu);
//            }
//        }

        // NEVER FORGET TO CLOSE THE SESSION_FACTORY
        SESSION_FACTORY.close();
    }

    /**
     * Create a new Student.
     *
     * @param name
     * @param age
     */
    public static void create(int id, String name, int age) {
        // Create a session
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = null;
        try {
            // Begin a transaction
            transaction = session.beginTransaction();
            Student stu = new Student();
            stu.setId(id);
            stu.setName(name);
            stu.setAge(age);
            // Save the student
            session.save(stu);
            // Commit the transaction
            transaction.commit();
        } catch (HibernateException ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }
    }

    /**
     * Read all the Students.
     *
     * @return a List of Students
     */
    public static List<Student> readAll() {
        List<Student> students = null;
        // Create a session
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = null;
        try {
            // Begin a transaction
            transaction = session.beginTransaction();
            //students = session.createQuery("FROM Student").list();
            // Commit the transaction
            transaction.commit();
        } catch (HibernateException ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }
        return students;
    }

    /**
     * Delete the existing Student.
     *
     * @param id
     */
    public static void delete(int id) {
        // Create a session
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = null;
        try {
            // Begin a transaction
            transaction = session.beginTransaction();
            // Get the Student from the database.
            Student stu = (Student) session.get(Student.class,
                    Integer.valueOf(id));
            // Delete the student
            session.delete(stu);
            // Commit the transaction
            transaction.commit();
        } catch (HibernateException ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }
    }

    /**
     * Update the existing Student.
     *
     * @param id
     * @param name
     * @param age
     */
    public static void upate(int id, String name, int age) {
        // Create a session
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = null;
        try {
            // Begin a transaction
            transaction = session.beginTransaction();
            // Get the Student from the database.
            Student stu = (Student) session.get(Student.class,
                    Integer.valueOf(id));
            // Change the values
            stu.setName(name);
            stu.setAge(age);
            // Update the student
            session.update(stu);

            // Commit the transaction
            transaction.commit();
        } catch (HibernateException ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }
    }
}
