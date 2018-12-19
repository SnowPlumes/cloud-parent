package me.lv.service;

import me.lv.entity.Order;

import java.util.List;

/**
 * @author lv
 */
public interface OrderService {

    /**
     * 获取全部
     *
     * @return
     */
    List<Order> listOrders();
}
