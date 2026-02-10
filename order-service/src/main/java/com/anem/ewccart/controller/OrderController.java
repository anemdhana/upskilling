package com.anem.ewccart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anem.ewccart.entity.Order;
import com.anem.ewccart.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/sample")
    public List<Order> listSampleOrders() {
        return orderRepository.findTop3ByOrderByIdAsc();
    }
}
