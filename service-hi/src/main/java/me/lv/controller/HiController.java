package me.lv.controller;

import me.lv.dto.JsonResponse;
import me.lv.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * @author lv
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HiController {
    private static Logger logger = LoggerFactory.getLogger(HiController.class);

    @Value("${server.port}")
    public String port;

    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    public String sayHi(String name) {
        logger.info(">>>>>> name:{}", name);
        return "hi " + name + " i am from port " + port;
    }

    @GetMapping("/getUser")
    public JsonResponse getUser() {
        return JsonResponse.success(userService.getUser());
    }
}
