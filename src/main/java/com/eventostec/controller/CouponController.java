

package com.eventostec.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventostec.api.domain.coupom.Coupon;
import com.eventostec.api.service.CouponService;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

  @Autowired
  private CouponService couponService;

  @PostMapping("/event/{eventid}")
  public <CouponRequestDTO> ResponseEntity<Coupon> addCouponsToEvent(@PathVariable("eventid") UUID eventID, @RequestBody com.eventostec.api.domain.event.coupon.CouponRequestDTO data) throws IllegalAccessException { 
    Coupon coupons = couponService.addCouponToEvent(eventID, data); 
    return ResponseEntity.ok(coupons);
  }
}
