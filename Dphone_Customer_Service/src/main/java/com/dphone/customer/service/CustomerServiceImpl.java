package com.dphone.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.dao.CustomerDaoImpl;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDaoImpl customerDaoImpl;

	@Override
	public boolean addCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		return customerDaoImpl.addCustomer(customerBean);
	}

	@Override
	public CustomerBean showCustomer(long customer_id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.showCustomer(customer_id);
	}

	@Override
	public boolean deleteCustomer(long customer_id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.deleteCustomer(customer_id);
	}

	@Override
	public boolean updateCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		return customerDaoImpl.updateCustomer(customerBean);
	}

//	@Override
//	public List<CustomerBean> showACustomer() {
//		// TODO Auto-generated method stub
//		return customerDaoImpl.showAllCustomer();
//	}
	
	
	
}
