 package com.dphone.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dphone.customer.bean.BuyingDetailsBean;
import com.dphone.customer.bean.CustomerBean;
import com.dphone.customer.client.BuyingDetailsClient;
import com.dphone.customer.entity.CustomerEntity;
import com.dphone.customer.service.CustomerService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RequestMapping("/customer/")
@RestController
public class CustomerController{

	@Autowired 
	private CustomerService customerService;
	
	@Autowired
	BuyingDetailsClient buyingDetailsClient;
	
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<Boolean> addCustomer(@RequestBody CustomerBean customerBean){
		boolean status=customerService.addCustomer(customerBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@GetMapping(value = "/showCustomer/{customer_id}")
	public ResponseEntity<CustomerBean> showCustomer(@PathVariable("customer_id") Long customer_id){
		CustomerBean customerBean=customerService.showCustomer(customer_id);
		return new ResponseEntity<CustomerBean>(customerBean,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteCustomer/{customer_id}")
	public ResponseEntity<Boolean> deleteCustomer(@PathVariable("customer_id") Long customer_id){
		boolean status=customerService.deleteCustomer(customer_id);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateCustomer")
	public ResponseEntity<Boolean> updateCustomer(@RequestBody CustomerBean customerBean){
		boolean status=customerService.updateCustomer(customerBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
//	@GetMapping(value = "/showAllCustomer")
//	public ResponseEntity<List<CustomerBean>> shoeAllCustomer(){
//		List<CustomerBean> customerBeans=customerService.showACustomer();
//		return new ResponseEntity<List<CustomerBean>>(customerBeans,HttpStatus.OK);
//	}
	
	//Buying Detail Feign Client
	@PostMapping(value = "/addProduct")
	@CircuitBreaker(name="buyigDetailCircuitBreaker",fallbackMethod = "buyinDetailAddProductFallBack")
	@RateLimiter(name = "buyigDetailRateLimiter",fallbackMethod = "buyinDetailAddProductFallBack" )
	public ResponseEntity<Boolean> addProduct(@RequestBody BuyingDetailsBean buyingDetailsBean){
		boolean status= buyingDetailsClient.addbuyingdetail(buyingDetailsBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	
	public ResponseEntity<Boolean>buyinDetailAddProductFallBack(BuyingDetailsBean buyingDetailsBean,Exception ex) {
		
		return new ResponseEntity<Boolean>(false,HttpStatus.OK);
		
	}
	
}
