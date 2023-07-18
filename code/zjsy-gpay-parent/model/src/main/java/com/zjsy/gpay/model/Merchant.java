package com.zjsy.gpay.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("商家表")
@TableName(value = "merchant")
@Data
public class Merchant implements Serializable {
    @ApiModelProperty("企业ID")
    @TableId
    private Integer merchantId;

    @ApiModelProperty("企业名称")
    private String merchantName;

    @ApiModelProperty("地址信息")
    private String merchantAddress;

    @ApiModelProperty("企业电话")
    private String merchantPhone;

    @ApiModelProperty("所属行业")
    private String industry;

    @ApiModelProperty("用户ID")
    private String userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
