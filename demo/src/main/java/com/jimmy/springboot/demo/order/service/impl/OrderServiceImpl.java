package com.jimmy.springboot.demo.order.service.impl;

import com.jimmy.springboot.demo.order.dao.OrderRepository;
import com.jimmy.springboot.demo.order.entity.OrderHeader;
import com.jimmy.springboot.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("orderService")
@Transactional(rollbackOn = Exception.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderHeader findById(Long orderId) {
        return orderRepository.findOrderByOrderId(orderId);
    }
}
