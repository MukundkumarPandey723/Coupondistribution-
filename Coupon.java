package com.Coupon_distribution.CouponDistribution_Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Corrected to Long

    private String code;

    public Coupon() {}

    // Getters and setters...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoupon_code() {
        return code;
    }

    public void setCoupon_code(String code) {
        this.code = code;
    }

    public Coupon(Long id, String code) {
        this.id = id;
        this.code = code;
    }
}
