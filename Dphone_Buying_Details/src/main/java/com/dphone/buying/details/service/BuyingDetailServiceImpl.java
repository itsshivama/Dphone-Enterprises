package com.dphone.buying.details.service;

import com.dphone.buying.details.bean.BuyingDetailsBean;
import com.dphone.buying.details.dao.BuyingDetailDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyingDetailServiceImpl implements BuyingDetailService {

	@Autowired
	private BuyingDetailDaoImpl buyingDetailDaoImpl;

	@Override
	public boolean addBuyingDetail(BuyingDetailsBean buyingDetailsBean) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.addBuyingDetail(buyingDetailsBean);
	}

	@Override
	public BuyingDetailsBean showBuyingDetail(long customer_id) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.showBuyingDetail(customer_id);
	}

	@Override
	public boolean deleteBuyingDetail(long customer_id) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.deleteBuyingDetail(customer_id);
	}

	@Override
	public boolean updateBuyingDetail(BuyingDetailsBean buyingDetailsBean) {
		// TODO Auto-generated method stub
		return buyingDetailDaoImpl.updateBuyingDetail(buyingDetailsBean);
	}
	
	
	
}
