package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.config.MapStrucConfig;
import com.dh.sp.map.struc.dto.OrderDto;
import com.dh.sp.map.struc.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = MapStrucConfig.class, uses = BillingAddressToBillingAddressDto.class)
public interface OrderToOrderDto {
    @Mappings({ @Mapping(source="source.desc", target="description")})
    OrderDto map(Order source);
}
