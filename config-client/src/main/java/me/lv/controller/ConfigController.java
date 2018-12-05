package me.lv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lv
 */
@RestController
public class ConfigController {

    @Value("${pro}")
    private String pro;

    @GetMapping(value = "/getPro")
    public String getPort() {
        return pro;
    }
}
