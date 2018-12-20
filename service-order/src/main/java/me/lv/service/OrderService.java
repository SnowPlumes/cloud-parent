package me.lv.service;

import me.lv.entity.Order;

import java.util.List;

/**
 * @author lv
 */
public interface OrderService {

    /**
     * list
     *
     * @return
     */
    List<Order> listOrders();

    /**
     * insert
     *
     * @param order
     * @return
     */
    Integer insertOrder(Order order);
}
