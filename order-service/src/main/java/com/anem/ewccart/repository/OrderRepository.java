package com.anem.ewccart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anem.ewccart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findTop3ByOrderByIdAsc();
}
