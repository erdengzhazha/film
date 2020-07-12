package com.cw.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaClient
public class SystemApplication {

    private static final Logger logger = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
       // SpringApplication.run(EurekaApplication.class, args);
        SpringApplication app = new SpringApplication(SystemApplication.class);
        ConfigurableEnvironment env =app.run(args).getEnvironment();
        logger.info("启动成功！");
        logger.info("System地址: \thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }

}
