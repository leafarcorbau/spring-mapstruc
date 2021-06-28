package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.CCType;
import com.dh.sp.map.struc.util.TestUtil;

import java.util.UUID;

public class TestOrderDto {

    public static OrderDto.OrderDtoBuilder getInstance(final UUID seed){
        return OrderDto.builder()
                .id(seed)
                .customerId(seed)
                .creditCartType(CCType.VISA)
                .creditCard(TestUtil.genField("cc", seed))
                .description(TestUtil.genField("desc", seed));

    }


}
