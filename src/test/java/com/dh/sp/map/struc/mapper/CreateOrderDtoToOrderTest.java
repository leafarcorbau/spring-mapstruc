package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.SpringMapstrucApplication;
import com.dh.sp.map.struc.dto.CreateOrderDto;
import com.dh.sp.map.struc.dto.TestCreateOrderDto;
import com.dh.sp.map.struc.dto.TestOrder;
import com.dh.sp.map.struc.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = SpringMapstrucApplication.class)
public class CreateOrderDtoToOrderTest {

    @Autowired
    private CreateOrderDtoToOrder createOrderDtoToOrder;

    @Test
    public void shouldMapCreateOrderDtoToOrder(){
        //Given
        final UUID customerId = UUID.randomUUID();
        final CreateOrderDto createOrderDto = TestCreateOrderDto.getInstance(customerId)
                .build();
        final Order expected = TestOrder.getInstance(customerId).build();
        //When
        final Order result = createOrderDtoToOrder.map(createOrderDto);
        //Then
        assertThat(result.getId()).isNotNull();
        assertThat(result).isEqualToIgnoringGivenFields(expected, "id", "billingAddress");
    }
}
