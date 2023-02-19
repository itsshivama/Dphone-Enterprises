package com.dphone.buying.details.service;

import com.dphone.buying.details.bean.BuyingDetailsBean;

public interface BuyingDetailService {

	boolean addBuyingDetail(BuyingDetailsBean buyingDetailsBean);
	
	BuyingDetailsBean showBuyingDetail(long customer_id);
	
	boolean deleteBuyingDetail(long customer_id);
	
	boolean updateBuyingDetail(BuyingDetailsBean buyingDetailsBean);
}
