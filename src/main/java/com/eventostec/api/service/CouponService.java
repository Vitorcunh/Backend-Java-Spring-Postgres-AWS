package com.eventostec.api.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.eventostec.api.domain.coupom.Coupon;
import com.eventostec.api.domain.event.coupon.CouponRequestDTO;
import com.eventostec.repositores.CouponRepository;
import com.eventostec.repositores.EventRepository;
import com.eventostec.api.domain.event.Event;

public class CouponService {

  @Autowired
  private CouponRepository couponRepository;

  @Autowired
  private EventRepository eventRepository;

  @SuppressWarnings("deprecation")
  public Coupon addCouponToEvent(UUID eventId, CouponRequestDTO data) throws IllegalAccessException {
    Event event = eventRepository.findById(eventId)
        .orElseThrow(() -> new IllegalAccessException("Event not found"));

    Coupon coupon = new Coupon();
    coupon.setCode(data.getCode());
    coupon.setDiscount(data.getDiscount());
    coupon.setValid(new Date(data.getValid()));
    coupon.setEvent(event);

    return couponRepository.save(coupon);
  }
}