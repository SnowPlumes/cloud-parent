package me.lv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lv
 */
@RestController
public class HiController {
    private static Logger logger = LoggerFactory.getLogger(HiController.class);

    @Value("${server.port}")
    public String port;

    @GetMapping("/hi")
    public String sayHi(String name) {
        logger.info(">>>>>> name:{}", name);
        return "hi " + name + " i am from port " + port;
    }
}
