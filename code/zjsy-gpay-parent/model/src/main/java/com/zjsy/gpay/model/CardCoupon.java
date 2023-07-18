package com.zjsy.gpay.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@TableName(value = "card_coupon")
@Data
@ApiModel("卡卷管理表")
public class CardCoupon implements Serializable {
    @ApiModelProperty("卡卷ID")
    //雪花算法
    @TableId(type = IdType.ASSIGN_ID)
    private Object couponId;

    @ApiModelProperty("卡卷名称")
    private String couponName;

    @ApiModelProperty("卡卷信息")
    private String couponInfo;

    @ApiModelProperty("已收集数量")
    private Integer collectedQuantity;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}