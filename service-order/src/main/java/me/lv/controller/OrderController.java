package me.lv.controller;

import me.lv.dto.JsonResponse;
import me.lv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lv
 */
@RestController
@RequestMapping(value = "order", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("getOrder")
    @ResponseBody
    public JsonResponse getOrder() {
        JsonResponse json = new JsonResponse();
        json.setResults(orderService.listOrders());
        return json;
    }
}
