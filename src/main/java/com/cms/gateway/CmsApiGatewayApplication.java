package com.cms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CmsApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApiGatewayApplication.class, args);
    }

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes().build();
//	}

}
