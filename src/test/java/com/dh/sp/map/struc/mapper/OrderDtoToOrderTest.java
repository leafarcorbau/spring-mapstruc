package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.SpringMapstrucApplication;
import com.dh.sp.map.struc.dto.*;
import com.dh.sp.map.struc.model.BillingAddress;
import com.dh.sp.map.struc.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(classes = SpringMapstrucApplication.class)
public class OrderDtoToOrderTest {

    @Autowired
    private OrderDtoToOrder orderDtoToOrder;

    @Test
    public void shouldMapOrderDtoToOrder(){
        //Given
        final UUID userId = UUID.randomUUID();
        final UUID billingAddressId = UUID.randomUUID();
        final BillingAddressDto billingAddressDto = TestBillingAddressDto.getInstance(billingAddressId).build();
        final OrderDto orderDto = TestOrderDto.getInstance(userId)
                .billingAddress(billingAddressDto)
                .build();
        final BillingAddress billingAddress = TestBillingAddress.getInstance(billingAddressId).build();
        final Order expected = TestOrder.getInstance(userId)
                .billingAddress(billingAddress)
                .build();
        //When
        final Order result = orderDtoToOrder.map(orderDto);

        //Then
        assertThat(result).isEqualTo(expected);
    }
}
