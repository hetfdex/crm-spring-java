package com.hetfdex.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hetfdex.crm.dao.CustomerDAO;
import com.hetfdex.crm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		// Session session = sessionFactory.getCurrentSession();

		// Query<Customer> query = session.createQuery("from Customer", Customer.class);

		Customer c1 = new Customer("Jose", "Pereira", "jose@email.com");
		Customer c2 = new Customer("Maria", "Rocha", "maria@email.com");

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(c1);
		customers.add(c2);

		return customers;

		// return query.getResultList();
	}
}