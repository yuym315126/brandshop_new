package com.qf.dto;

import lombok.Data;

/**
 * @program: demo
 * @description:
 * @author: money
 * @create: 2020-07-23 20:41
 */
@Data
public class AddOrderItemDto {
//    private String itemsId;
//    private String itemsNum;
    private Integer userId;
    private Integer productId;
    private Integer orderId;
    private Integer addressId;
}
