package com.jimmy.springboot.demo.common;

import com.jimmy.springboot.demo.order.entity.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderHeader, Long> {
}
