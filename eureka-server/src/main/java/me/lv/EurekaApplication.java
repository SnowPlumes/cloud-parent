package me.lv;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lv
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    private static Logger logger = LoggerFactory.getLogger(EnableEurekaServer.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        logger.info(">>>>>> eureka application running ......");
    }
}
