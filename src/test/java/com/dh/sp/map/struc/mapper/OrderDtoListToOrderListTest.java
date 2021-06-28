package com.dh.sp.map.struc.mapper;

import com.dh.sp.map.struc.SpringMapstrucApplication;
import com.dh.sp.map.struc.dto.OrderDto;
import com.dh.sp.map.struc.dto.TestOrder;
import com.dh.sp.map.struc.dto.TestOrderDto;
import com.dh.sp.map.struc.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = SpringMapstrucApplication.class)
public class OrderDtoListToOrderListTest {

    @Autowired
    private OrderDtoListToOrderList orderDtoListToOrderList;

    @Test
    public void shouldMapOrderDtoListToOrderList(){
        //Given
        final UUID userId = UUID.randomUUID();
        final OrderDto orderDto = TestOrderDto.getInstance(userId).build();
        final List<OrderDto> orderDtoList = List.of(orderDto);
        final Order expected = TestOrder.getInstance(userId).build();

        //When
        final List<Order> result = orderDtoListToOrderList.map(orderDtoList);

        //Then
        assertThat(result).isNotEmpty();
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0)).isEqualTo(expected);
    }
}
