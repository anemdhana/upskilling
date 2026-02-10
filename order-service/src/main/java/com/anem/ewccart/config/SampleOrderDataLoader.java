package com.anem.ewccart.config;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anem.ewccart.entity.Order;
import com.anem.ewccart.repository.OrderRepository;

@Component
public class SampleOrderDataLoader implements CommandLineRunner {

    private final OrderRepository orderRepository;

    public SampleOrderDataLoader(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) {
        if (orderRepository.count() > 0) {
            return;
        }

        List<Order> sampleOrders = List.of(
                new Order("ORD-1001", "Asha Kumar", new BigDecimal("1499.00"), "NEW"),
                new Order("ORD-1002", "Ravi Menon", new BigDecimal("249.50"), "PAID"),
                new Order("ORD-1003", "Divya Iyer", new BigDecimal("799.99"), "SHIPPED")
        );

        orderRepository.saveAll(sampleOrders);
    }
}
