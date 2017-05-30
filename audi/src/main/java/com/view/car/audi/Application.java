package com.view.car.audi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author yeguangkun on 2017/5/29 下午5:09
 * @version 1.0
 */
@SpringBootApplication(scanBasePackageClasses = Application.class)
@EnableEurekaClient
@EnableWebMvc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
