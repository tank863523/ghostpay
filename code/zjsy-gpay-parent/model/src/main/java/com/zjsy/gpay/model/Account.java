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
@TableName(value ="account")
@ApiModel("账户表")
@Data
public class Account implements Serializable {
    @ApiModelProperty("账户ID")
    @TableId
    private Integer accountId;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("余额")
    private BigDecimal balance;

    @ApiModelProperty("提现密码")
    private String withdrawalPassword;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}