package me.lv.service.impl;

import me.lv.dao.OrderDao;
import me.lv.entity.Order;
import me.lv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lv
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> listOrders() {
        return orderDao.listOrders();
    }
}
