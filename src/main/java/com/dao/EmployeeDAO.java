package com.dao;


import com.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void addEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Employee getEmployeeById(int employeeId) {
        Session session = sessionFactory.openSession();
        Employee employee = null;
        try {
            employee = session.get(Employee.class, employeeId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employee;
    }

    public void updateEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

