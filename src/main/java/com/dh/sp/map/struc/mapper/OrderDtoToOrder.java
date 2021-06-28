package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.config.MapStrucConfig;
import com.dh.sp.map.struc.dto.OrderDto;
import com.dh.sp.map.struc.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = MapStrucConfig.class, uses = BillingAddressDtoToBillingAddress.class)
public interface OrderDtoToOrder {
    @Mappings(value = {@Mapping(source = "source.description", target = "desc")})
    Order map(OrderDto source);
}
