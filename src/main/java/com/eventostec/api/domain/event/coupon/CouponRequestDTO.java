package com.eventostec.api.domain.event.coupon;

public record  CouponRequestDTO (String code, Integer discount, Long valid) {

    public String getCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Integer getDiscount() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getDiscount'");
    }

    public String getValid() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getValid'");
    }
  
}
