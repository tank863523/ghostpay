package com.zjsy.gpay.enums;

import lombok.Getter;

/**
 * 交易状态码
 */
@Getter
public enum TransactionStatus {
    UNPAID(0, "未支付"),
    COMPLETED(1, "交易完成"),
    REFUND_PENDING(2, "申请退款中"),
    CANCELED(3, "交易取消");

    private final int code;
    private final String description;

    TransactionStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
