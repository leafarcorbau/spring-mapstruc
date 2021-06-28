package com.dh.sp.map.struc.dto;

import java.util.UUID;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;



@Value
@Builder
@ToString
@EqualsAndHashCode
public class BillingAddressDto {
    UUID id;
    String street;
    String number;
    String zipcode;
}
