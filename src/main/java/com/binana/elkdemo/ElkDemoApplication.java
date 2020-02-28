package com.binana.elkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkDemoApplication {
    private static Logger logger = LoggerFactory.getLogger("elk_logger");
    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);
        logger.info("我是一个简易的spring-boot连接ELK的应用");
        logger.warn("DSADDSDSD");

    }

}
