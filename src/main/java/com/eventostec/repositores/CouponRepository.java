package com.eventostec.repositores;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.api.domain.coupom.Coupon;;;;

public interface CouponRepository extends JpaRepository <Coupon, UUID>{
  
}
