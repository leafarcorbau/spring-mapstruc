package com.dh.sp.map.struc.service;

import com.dh.sp.map.struc.dto.OrderDto;
import com.dh.sp.map.struc.mapper.OrderToOrderDto;
import com.dh.sp.map.struc.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderToOrderDto orderMapper;

    public OrderDto process(final Order order){

        OrderDto orderDto = orderMapper.map(order);
        return orderDto;
    }
}
