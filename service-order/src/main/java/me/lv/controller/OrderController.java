package me.lv.controller;

import me.lv.dto.JsonResponse;
import me.lv.entity.Order;
import me.lv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author lv
 */
@RestController
@RequestMapping(value = "order", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("listOrders")
    public JsonResponse listOrders() {
        return JsonResponse.success(orderService.listOrders());
    }

    @PostMapping("order")
    public JsonResponse order(@RequestBody Order order) {
        orderService.insertOrder(order);
        return JsonResponse.success();
    }
}
