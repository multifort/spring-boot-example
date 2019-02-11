package com.springboot.microservice.demo.service.impl;

import com.springboot.microservice.demo.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QueryServiceImpl implements QueryService {

    @Override
    public String list() {
        return null;
    }

    @Override
    public String get(String name) {
        return null;
    }
}
