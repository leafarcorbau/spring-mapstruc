package com.dh.sp.map.struc.service;

import com.dh.sp.map.struc.SpringMapstrucApplication;
import com.dh.sp.map.struc.dto.*;
import com.dh.sp.map.struc.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        classes = SpringMapstrucApplication.class)
public class OrderServiceIntegrationTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void shouldProcessOrder(){
        //Given
        final UUID userId = UUID.randomUUID();
        final UUID addressId = UUID.randomUUID();
        final Order order = TestOrder.getInstance(userId)
                .billingAddress(TestBillingAddress.getInstance(addressId).build())
                .build();
        final OrderDto expected = TestOrderDto.getInstance(userId)
                .billingAddress(TestBillingAddressDto.getInstance(addressId).build())
                .build();
        //When
        final OrderDto result = orderService.process(order);
        //then
        assertThat(result).isEqualTo(expected);
    }
}
