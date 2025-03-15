// CouponController.java
package com.Coupon_distribution.CouponDistribution_Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class CouponController {

    private final CouponService couponService;
    private final ToClaimService claimService;

    @Autowired
    public CouponController(CouponService couponService, ToClaimService claimService) {
        this.couponService = couponService;
        this.claimService = claimService;
    }

    @GetMapping("/claim")
    public ResponseEntity<String> claimCoupon(HttpServletRequest request, HttpServletResponse response) {
        String ipAddress = request.getRemoteAddr();

        if (!claimService.canClaim(ipAddress, request)) {
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Please wait before claiming another coupon.");
        }

        Coupon coupon = couponService.getNextCoupon();
        if (coupon == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No coupons available.");
        }

        claimService.recordClaim(ipAddress, coupon.getCoupon_code());

        return ResponseEntity.ok("Coupon claimed: " + coupon.getCoupon_code());
       
    }
}
