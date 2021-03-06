package me.lv.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lv
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("me.lv.provider.dao")
public class UserApplication {
    private static Logger logger = LoggerFactory.getLogger(UserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        logger.info(">>>>>> user application running ......");
    }
}
