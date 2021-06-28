package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.CCType;
import com.dh.sp.map.struc.util.TestUtil;

import java.util.UUID;

public class TestCreateOrderDto {

    public static CreateOrderDto.CreateOrderDtoBuilder getInstance(final UUID seed){
        return CreateOrderDto.builder()
                .id(seed)
                .customerId(seed)
                .creditCartType(CCType.VISA)
                .creditCard(TestUtil.genField("cc", seed))
                .description(TestUtil.genField("desc", seed));

    }


}
