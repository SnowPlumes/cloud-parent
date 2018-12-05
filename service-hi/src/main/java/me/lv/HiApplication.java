package me.lv;

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
public class HiApplication {
    private static Logger logger = LoggerFactory.getLogger(HiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HiApplication.class, args);
        logger.info(">>>>>> HiApplication running ......");
    }
}
