package com.dphone.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dphone.customer.entity.CustomerEntity;

@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity, Long>{
//	@Modifying
//	@Query("select c from customer c")
//	List<CustomerEntity> showAllCustomer();
}
