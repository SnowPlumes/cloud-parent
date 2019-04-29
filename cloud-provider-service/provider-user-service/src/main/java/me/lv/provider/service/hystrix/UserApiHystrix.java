package me.lv.provider.service.hystrix;

import me.lv.JsonResponse;
import me.lv.provider.service.UserApi;
import org.springframework.stereotype.Component;

/**
 * @author lv
 */
@Component
public class UserApiHystrix implements UserApi {

    @Override
    public JsonResponse getUser(Integer userId) {
        return JsonResponse.fail("test");
    }
}
