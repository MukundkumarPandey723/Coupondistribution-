package com.Coupon_distribution.CouponDistribution_Assignment;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
@Service
public interface ToClaimService {
	 boolean canClaim(String ipAddress, HttpServletRequest request);
	    void recordClaim(String ipAddress, String couponCode);
}
