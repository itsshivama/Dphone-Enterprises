package com.dphone.customer.service;

import java.util.List;

import com.dphone.customer.bean.CustomerBean;

public interface CustomerService {

	boolean addCustomer(CustomerBean customerBean);
	
	CustomerBean showCustomer(long customer_id);
	
	boolean deleteCustomer(long customer_id);
	
	boolean updateCustomer(CustomerBean customerBean);
	
//	List<CustomerBean> showACustomer();

}
