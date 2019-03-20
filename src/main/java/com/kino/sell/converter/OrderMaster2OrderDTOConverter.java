package com.kino.sell.converter;

import com.kino.sell.dataobject.OrderMaster;
import com.kino.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: kino
 * @Date: 2019/3/10 15:59
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {

        //遍历list 将内容写入List<OrderDTO>
        return orderMasterList
                .stream()
                .map(e -> convert(e))
                .collect(Collectors.toList());
    }
}
