package com.dphone.buying.details.controller;

import com.dphone.buying.details.bean.BuyingDetailsBean;
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

import com.dphone.buying.details.service.BuyingDetailService;

@RequestMapping("/buyingdetail/")
@RestController
public class BuyingDetailController {

	@Autowired 
	private BuyingDetailService buyingDetailService;
	
	@PostMapping(value = "/addbuyingdetail")
	public ResponseEntity<Boolean> addBuyingDetail(@RequestBody BuyingDetailsBean buyingDetailsBean){
		boolean status= buyingDetailService.addBuyingDetail(buyingDetailsBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@GetMapping(value = "/showbuyingdetail/{customer_id}")
	public ResponseEntity<BuyingDetailsBean> showBuyingDetail(@PathVariable("customer_id") Long customer_id){
		BuyingDetailsBean buyingDetailsBean = buyingDetailService.showBuyingDetail(customer_id);
		return new ResponseEntity<BuyingDetailsBean>(buyingDetailsBean,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deletebuyingdetail/{customer_id}")
	public ResponseEntity<Boolean> deleteBuyingDetail(@PathVariable("customer_id") Long customer_id){
		boolean status= buyingDetailService.deleteBuyingDetail(customer_id);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updatebuyingdetail")
	public ResponseEntity<Boolean> updateBuyingDetail(@RequestBody BuyingDetailsBean buyingDetailsBean){
		boolean status= buyingDetailService.updateBuyingDetail(buyingDetailsBean);
		return new ResponseEntity<Boolean>(status,HttpStatus.OK);
	}
}
