package com.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by michael on 7/21/16.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {


    public static void main(String[] args) {

//        System.setProperty("eureka.client.enabled","false");
        SpringApplication.run(Application.class,args);
    }

}
