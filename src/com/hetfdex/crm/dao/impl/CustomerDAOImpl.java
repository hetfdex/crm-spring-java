package com.hetfdex.crm.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

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
	@Transactional
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();

		Query<Customer> query = session.createQuery("from Customer", Customer.class);

		return query.getResultList();
	}
}