package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.config.MapStrucConfig;
import com.dh.sp.map.struc.dto.BillingAddressDto;
import com.dh.sp.map.struc.model.BillingAddress;
import org.mapstruct.Mapper;

@Mapper(config = MapStrucConfig.class)
public interface BillingAddressDtoToBillingAddress {
    BillingAddress map(BillingAddressDto source);
}
