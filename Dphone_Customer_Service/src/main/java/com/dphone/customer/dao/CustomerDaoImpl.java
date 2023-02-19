package com.dphone.customer.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.entity.CustomerEntity;

public class CustomerDaoImpl {

	@Autowired
	public CustomerDao customerDao;
	
	public boolean addCustomer(CustomerBean customerBean) {
		CustomerEntity customerEntity=new CustomerEntity();
		BeanUtils.copyProperties(customerBean, customerEntity);
		try {
			customerDao.save(customerEntity);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	public CustomerBean showCustomer(long customer_id) {
		try {
			CustomerEntity customerEntity=customerDao.getReferenceById(customer_id);
			CustomerBean customerBean=new CustomerBean();
			BeanUtils.copyProperties(customerEntity, customerBean);
			return customerBean;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public boolean deleteCustomer(long customer_id) {
		try {
			customerDao.deleteById(customer_id);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	public boolean updateCustomer(CustomerBean customerBean) {
		try {
			CustomerEntity customerEntity=new CustomerEntity();
			BeanUtils.copyProperties(customerBean, customerEntity);
			customerDao.save(customerEntity);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
//	public List<CustomerBean> showAllCustomer(){
//		List<CustomerEntity> customerEntities=customerDao.showAllCustomer();
//		List<CustomerBean> customerBeans=new ArrayList<>();
//		
//		for(CustomerEntity customer:customerEntities) {
//			CustomerBean customerBean=new CustomerBean();
//			BeanUtils.copyProperties(customer, customerBean);
//			customerBeans.add(customerBean);
//		}
//		return customerBeans;
//		
//	}
	
}
