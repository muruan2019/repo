package com.company.project;

import com.company.project.common.log.XlyLogger;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static Logger logger = XlyLogger.get();

    public static void main(String[] args) {
        logger.info("容器启动开始");
        SpringApplication.run(Application.class, args);
        logger.info("容器启动结束");
    }
}

