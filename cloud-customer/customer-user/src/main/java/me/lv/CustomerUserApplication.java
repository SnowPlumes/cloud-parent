package me.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lv
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class CustomerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerUserApplication.class, args);
    }
}
