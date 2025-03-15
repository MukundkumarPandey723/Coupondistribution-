package com.Coupon_distribution.CouponDistribution_Assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<ToClaim, String> {
    // You can add custom query methods here if needed
}
