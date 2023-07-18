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

@TableName(value = "entity_card")
@Data
@ApiModel("实体卡管理表")
public class EntityCard implements Serializable {
    @ApiModelProperty("实体卡ID")
    @TableId(type = IdType.INPUT)
    private Object cardId;

    @ApiModelProperty("实体卡编号")
    private String cardNumber;

    @ApiModelProperty("实体卡名称")
    private String cardName;

    @ApiModelProperty("实体卡信息")
    private String cardInfo;

    @ApiModelProperty("已收集数量")
    private Integer collectedQuantity;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}