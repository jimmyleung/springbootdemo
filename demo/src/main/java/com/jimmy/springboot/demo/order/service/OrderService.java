package com.jimmy.springboot.demo.order.service;

import com.jimmy.springboot.demo.order.entity.OrderHeader;

public interface OrderService {

    public OrderHeader findById(Long orderId);
}
