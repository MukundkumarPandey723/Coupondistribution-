package com.Coupon_distribution.CouponDistribution_Assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CouponServicee  implements CouponService{

	public CouponServicee() {}
	
	@Autowired
	CouponRepository cop;
	private int coupon_index;
	private List<Coupon> coupons;
	private int couponIndex;
	@Override
	public void loadCoupons() {
		coupons = cop.findAll();

	}
	@Override
	public Coupon getNextCoupon() {
        // Implement your round-robin logic here
        // For demonstration, let's return a dummy coupon
        Coupon dummyCoupon = new Coupon();
        dummyCoupon.setCoupon_code("HELLO COUPON");
   
        return dummyCoupon;
    }
	

}
