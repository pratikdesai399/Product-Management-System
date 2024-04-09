package com.pratik.orderservice.service;

import com.pratik.orderservice.dto.OrderLineItemsDto;
import com.pratik.orderservice.dto.OrderRequest;
import com.pratik.orderservice.model.Order;
import com.pratik.orderservice.model.OrderLineItems;
import com.pratik.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();

        order.setOrderLineItemsList(orderLineItemsList);
        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto item) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setId(item.getId());
        orderLineItems.setQuantity(item.getQuantity());
        orderLineItems.setPrice(item.getPrice());
        orderLineItems.setSkuCode(item.getSkuCode());
        return orderLineItems;
    }
}
