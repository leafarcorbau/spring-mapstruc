package com.dh.sp.map.struc.dto;

import com.dh.sp.map.struc.model.CCType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

import javax.validation.constraints.Null;
import java.util.UUID;

@Value
@Builder
@ToString
@EqualsAndHashCode
public class CreateOrderDto {
    @JsonIgnore
    @Null
    UUID id;
    UUID customerId;
    String creditCard;
    CCType creditCartType;
    String description;
}
