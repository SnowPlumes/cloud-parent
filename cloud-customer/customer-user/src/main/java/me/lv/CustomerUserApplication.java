package me.lv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(CustomerUserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CustomerUserApplication.class, args);
        logger.info(">>>>>> customer user application running ......");
    }
}
