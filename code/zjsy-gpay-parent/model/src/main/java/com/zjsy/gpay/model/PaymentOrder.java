package com.zjsy.gpay.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("支付订单表")
@TableName(value = "payment_order")
@Data
public class PaymentOrder implements Serializable {
    /**
     * 订单编号
     */
    @ApiModelProperty("订单编号")
    @TableId
    private String orderId;

    @ApiModelProperty("收款用户ID")
    private Integer userId;

    @ApiModelProperty("交易金额")
    private BigDecimal amount;

    @ApiModelProperty("交易状态")
    private Integer status;

    @ApiModelProperty("支付方式/收款方式")
    private String paymentMethod;

    @ApiModelProperty("订单创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}