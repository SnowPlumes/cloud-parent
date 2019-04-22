package me.lv.controller;

import me.lv.JsonResponse;
import me.lv.provider.service.UserApi;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lv
 */
@RestController
@RequestMapping(value = "customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Resource
    private UserApi userApi;

    @GetMapping("getUser")
    public JsonResponse getUser(Integer userId) {
        return userApi.getUser(userId);
    }

}
