package com.springboot.microservice.demo.log.annonation;

import com.springboot.microservice.demo.log.configuration.AuditLogConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@Import(AuditLogConfiguration.class)
@Documented
public @interface EnableAuditLog {
}
