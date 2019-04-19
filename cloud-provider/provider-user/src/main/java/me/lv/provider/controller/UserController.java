package me.lv.provider.controller;

import me.lv.JsonResponse;
import me.lv.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lv
 */
@RestController
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public JsonResponse getUser(Integer userId) {
        return JsonResponse.success(userService.getUserById(userId));
    }
}
