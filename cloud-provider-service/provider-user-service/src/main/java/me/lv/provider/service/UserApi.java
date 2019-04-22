package me.lv.provider.service;

import me.lv.JsonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lv
 */
@FeignClient(value = "provider-user")
@RequestMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface UserApi {

    /**
     * 获取用户
     *
     * @param userId 用户id
     * @return 用户信息
     */
    @GetMapping("getUser")
    JsonResponse getUser(@RequestParam("userId")Integer userId);
}
