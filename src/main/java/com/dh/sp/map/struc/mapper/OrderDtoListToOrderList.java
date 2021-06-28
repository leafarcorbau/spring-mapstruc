package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.config.MapStrucConfig;
import com.dh.sp.map.struc.dto.OrderDto;
import com.dh.sp.map.struc.model.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapStrucConfig.class, uses = OrderDtoToOrder.class)
public interface OrderDtoListToOrderList {
    List<Order> map(List<OrderDto> orders);
}
