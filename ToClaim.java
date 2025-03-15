package com.Coupon_distribution.CouponDistribution_Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ToClaim {

    public ToClaim() {}

    @Id
    private String ip_address;

    private LocalDateTime timestamp;
    private String couponCode;

    public ToClaim(String ip_address, LocalDateTime timestamp, String couponCode) {
        this.ip_address = ip_address;
        this.timestamp = timestamp;
        this.couponCode = couponCode;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
