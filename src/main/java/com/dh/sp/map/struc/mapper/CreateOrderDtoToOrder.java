package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.config.MapStrucConfig;
import com.dh.sp.map.struc.dto.CreateOrderDto;
import com.dh.sp.map.struc.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapStrucConfig.class)
public interface CreateOrderDtoToOrder {
    @Mapping(source = "source.description", target = "desc")
    @Mapping(target = "id", expression = "java(UUID.randomUUID())")
    Order map(CreateOrderDto source);
}
