package com.dphone.buying.details.dao;

import com.dphone.buying.details.bean.BuyingDetailsBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.buying.details.entity.BuyingDetailEntity;

public class BuyingDetailDaoImpl {

	@Autowired
	public BuyingDetailDao buyingDetailDao;
	
	public boolean addBuyingDetail(BuyingDetailsBean buyingDetailsBean) {
		BuyingDetailEntity buyingDetailEntity =new BuyingDetailEntity();
		BeanUtils.copyProperties(buyingDetailsBean, buyingDetailEntity);
		try {
			buyingDetailDao.save(buyingDetailEntity);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	public BuyingDetailsBean showBuyingDetail(long customer_id) {
		try {
			BuyingDetailEntity buyingDetailEntity = buyingDetailDao.getReferenceById(customer_id);
			BuyingDetailsBean buyingDetailsBean =new BuyingDetailsBean();
			BeanUtils.copyProperties(buyingDetailEntity, buyingDetailsBean);
			return buyingDetailsBean;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public boolean deleteBuyingDetail(long customer_id) {
		try {
			buyingDetailDao.deleteById(customer_id);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	public boolean updateBuyingDetail(BuyingDetailsBean buyingDetailsBean) {
		try {
			BuyingDetailEntity buyingDetailEntity =new BuyingDetailEntity();
			BeanUtils.copyProperties(buyingDetailsBean, buyingDetailEntity);
			buyingDetailDao.save(buyingDetailEntity);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
}
