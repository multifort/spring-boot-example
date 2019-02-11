package com.springboot.microservice.demo.log.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springboot.microservice.demo.log" )
public class AuditLogConfiguration {
}
