package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.CCType;
import com.dh.sp.map.struc.model.Order;
import com.dh.sp.map.struc.util.TestUtil;

import java.util.UUID;

public class TestOrder {

    public static Order.OrderBuilder getInstance(final UUID seed){
        return Order.builder()
                .id(seed)
                .customerId(seed)
                .creditCartType(CCType.VISA)
                .creditCard(TestUtil.genField("cc", seed))
                .desc(TestUtil.genField("desc", seed));

    }
}
