package com.zjsy.gpay.api;

import com.zjsy.gpay.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 订单接口
 */
@FeignClient("service-order")
public interface OrderServiceClient {
    /**
     * 查询订单服务
     */
//    @GetMapping("/orders/{orderId}")
//    OrderDTO getOrder(@PathVariable("orderId") String orderId);

}
