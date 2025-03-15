package com.Coupon_distribution.CouponDistribution_Assignment;

import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import jakarta.servlet.http.HttpServletRequest;
@Service
public class ToClaimServicee  implements ToClaimService{

	@Autowired
	ClaimRepository clai;
	 private ClaimRepository claimRepository;
	    private final long COOLDOWN_PERIOD = 1800;
	@Override
	public boolean canClaim(String ipAddress, HttpServletRequest request) {
        // Implement your logic to check if the IP can claim a coupon
        // For demonstration, let's always return true
        return true;
    }
 @Override
    public void recordClaim(String ipAddress, String couponCode) {
        // Implement your logic to record the claim
        // For demonstration, let's just print a message
        System.out.println("Claim recorded: IP=" + ipAddress + ", Coupon=" + couponCode);
    }

	
}
