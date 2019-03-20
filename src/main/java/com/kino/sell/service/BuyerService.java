package com.kino.sell.service;

import com.kino.sell.dto.OrderDTO;

/**
 * @Author: kino
 * @Date: 2019/3/11 23:24
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
