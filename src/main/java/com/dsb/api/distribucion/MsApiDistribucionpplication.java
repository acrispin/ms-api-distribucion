package com.dsb.api.distribucion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author acrispin
 * @since 25/07/2020
 */
@ComponentScan
@ComponentScan({"com.dsb.api.commons.util.config"})
@EnableEurekaClient
@SpringBootApplication
public class MsApiDistribucionpplication {

    public static void main(String[] args) {
        SpringApplication.run(MsApiDistribucionpplication.class, args);
    }

}

