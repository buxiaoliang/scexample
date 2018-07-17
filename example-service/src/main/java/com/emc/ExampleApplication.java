package com.emc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bur on 2018/7/16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @RequestMapping("/hello")
    public String home() {
        return "Hello world";
    }

}
