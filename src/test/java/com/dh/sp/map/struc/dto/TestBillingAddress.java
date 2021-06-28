package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.BillingAddress;
import com.dh.sp.map.struc.model.Order;
import com.dh.sp.map.struc.util.TestUtil;

import java.util.UUID;

public class TestBillingAddress {

    public static BillingAddress.BillingAddressBuilder getInstance(final UUID seed){
        return BillingAddress.builder()
                .id(seed)
                .street(TestUtil.genField("street", seed))
                .number("4")
                .zipcode(TestUtil.genField("zip", seed));

    }


}
