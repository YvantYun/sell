package com.kino.sell.dto;

import lombok.Data;

/**
 * @Author: kino
 * @Date: 2019/3/7 23:04
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
