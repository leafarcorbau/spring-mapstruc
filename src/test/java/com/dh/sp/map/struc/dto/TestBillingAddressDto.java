package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.util.TestUtil;

import java.util.UUID;

public class TestBillingAddressDto {

    public static BillingAddressDto.BillingAddressDtoBuilder getInstance(final UUID seed){
        return BillingAddressDto.builder()
                .id(seed)
                .street(TestUtil.genField("street", seed))
                .number("4")
                .zipcode(TestUtil.genField("zip", seed));

    }


}
