package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.CCType;
import lombok.*;

import java.util.UUID;

@Value
@Builder
@ToString
@EqualsAndHashCode
public class OrderDto {
    UUID id;
    UUID customerId;
    String creditCard;
    CCType creditCartType;
    String description;
    BillingAddressDto billingAddress;
}
