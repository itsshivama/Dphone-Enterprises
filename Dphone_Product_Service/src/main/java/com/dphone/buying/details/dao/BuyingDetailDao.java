package com.dphone.buying.details.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dphone.buying.details.entity.BuyingDetailEntity;

@Repository
public interface BuyingDetailDao extends JpaRepository<BuyingDetailEntity, Long>{
}
