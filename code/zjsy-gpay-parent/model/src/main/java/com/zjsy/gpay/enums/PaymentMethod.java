package com.zjsy.gpay.enums;

import lombok.Getter;

/**
 * 支付方式
 */
@Getter
public enum PaymentMethod {
    SCAN_CODE("扫码收款"),
    WECHAT_PAY("微信支付"),
    ALIPAY("支付宝支付");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
