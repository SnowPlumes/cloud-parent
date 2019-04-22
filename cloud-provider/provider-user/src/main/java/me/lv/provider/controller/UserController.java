package me.lv.provider.controller;

import me.lv.JsonResponse;
import me.lv.provider.service.UserApi;
import me.lv.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lv
 */
@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public JsonResponse getUser(Integer userId) {
        return JsonResponse.success(userService.getUserById(userId));
    }
}
