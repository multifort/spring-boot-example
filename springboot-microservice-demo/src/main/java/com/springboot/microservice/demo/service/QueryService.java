package com.springboot.microservice.demo.service;

public interface QueryService {
    default String list(){
        return "";
    }

    default String get(String name){
        return "";
    }
}
