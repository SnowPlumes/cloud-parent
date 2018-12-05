package me.lv.service;

import me.lv.hystrix.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lv
 */
@FeignClient(value = "service-hi", fallback = HiHystrix.class)
public interface HiService {

    /**
     * test
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
