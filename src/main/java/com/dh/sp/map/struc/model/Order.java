package com.dh.sp.map.struc.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
@ToString
@EqualsAndHashCode
public class Order {
    UUID id;
    UUID customerId;
    String creditCard;
    CCType creditCartType;
    String desc;
    BillingAddress billingAddress;
}
