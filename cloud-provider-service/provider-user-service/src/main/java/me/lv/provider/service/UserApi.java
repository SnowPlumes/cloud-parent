package me.lv.provider.service;

import me.lv.JsonResponse;
import me.lv.provider.service.hystrix.UserApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lv
 */
@FeignClient(value = "provider-user", fallback = UserApiHystrix.class)
public interface UserApi {

    /**
     * 获取用户
     *
     * @param userId 用户id
     * @return 用户信息
     */
    @GetMapping("/user/getUser")
    JsonResponse getUser(@RequestParam("userId")Integer userId);
}
