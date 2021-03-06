package com.springboot.microservice.demo;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.springboot.microservice.demo.log.annonation.EnableAuditLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAuditLog
@EnableSwagger2Doc
public class SpringbootMicroserviceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroserviceDemoApplication.class, args);
    }

}

