package me.lv.hystrix;

import me.lv.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements HiService{

    @Override
    public String sayHi(String name) {
        return "error " + name;
    }
}
