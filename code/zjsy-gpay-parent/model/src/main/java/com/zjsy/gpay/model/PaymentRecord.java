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


@ApiModel("收支明细表")
@TableName(value = "payment_record")
@Data
public class PaymentRecord implements Serializable {

    @ApiModelProperty("记录ID")
    @TableId
    private String recordId;

    @ApiModelProperty("订单ID")
    private Integer orderId;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("金额/正负")
    private BigDecimal amount;

    @ApiModelProperty("支付信息")
    private String paymentSource;

    @ApiModelProperty("支付后/余额")
    private BigDecimal balance;

    @ApiModelProperty("支付时间/创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}