package com.jimmy.springboot.demo.order.dao;

import com.jimmy.springboot.demo.order.entity.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderHeader, Long> {

    OrderHeader findOrderByOrderId(Long orderId);
}
