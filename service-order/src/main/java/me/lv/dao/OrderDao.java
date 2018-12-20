package me.lv.dao;

import me.lv.entity.Order;

import java.util.List;

/**
 * @author lv
 */
public interface OrderDao {

    /**
     * 获取所有
     *
     * @return
     */
    List<Order> listOrders();

    /**
     * 保存
     *
     * @param order
     * @return
     */
    Integer insertOrder(Order order);

    /**
     * 获取
     *
     * @param orderId
     * @return
     */
    Order getOrderById(Integer orderId);
}
