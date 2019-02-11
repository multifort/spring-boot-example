package com.springboot.microservice.demo.log.annonation;

import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    String targetObject() default "";
    String remark() default "";
}
