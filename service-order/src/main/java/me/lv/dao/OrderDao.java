package me.lv.dao;

import me.lv.entity.Order;

import java.util.List;

/**
 * @author lv
 */
public interface OrderDao {

    List<Order> listOrders();

    Integer insertOrder(Order order);

    Order getOrderById(Integer orderId);
}
