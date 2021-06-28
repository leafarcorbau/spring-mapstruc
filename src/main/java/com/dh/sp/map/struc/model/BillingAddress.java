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
public class BillingAddress {
    UUID id;
    String street;
    String number;
    String zipcode;
}
