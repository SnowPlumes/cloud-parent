package me.lv;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lv
 */
@SpringBootApplication
public class GatewayApplication {

    private static Logger logger = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        logger.info(">>>>>>>>> gateway application running ......");
    }
}
