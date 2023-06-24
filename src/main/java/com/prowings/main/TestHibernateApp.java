package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.Employee;

public class TestHibernateApp {

	public static void main(String[] args) {

		Employee emp1= new Employee();
		emp1.setId(10);
		emp1.setName("Ram");
		emp1.setAddress("Pune");

		Configuration conf = new Configuration();

		conf.configure();

		SessionFactory sf = conf.buildSessionFactory();

		Session session = sf.openSession();

		Transaction txn = session.beginTransaction();

		session.save(emp1);

		txn.commit();

		System.out.println("employee object saved to DB successfully!!!");
		session.close();

	}

}