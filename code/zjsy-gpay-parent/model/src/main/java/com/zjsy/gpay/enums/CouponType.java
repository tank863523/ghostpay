package com.zjsy.gpay.enums;

/**
 * 优惠券种类
 */
public enum CouponType {
    COUPON("优惠券"),
    DREAM_HOTEL("星梦酒店优惠"),
    STARBUCKS("星巴克优惠"),
    OTHER_PHYSICAL_CARD("其他实体卡");

    private final String description;

    CouponType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
