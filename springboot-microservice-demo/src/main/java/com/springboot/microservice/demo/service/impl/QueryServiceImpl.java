package com.springboot.microservice.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.springboot.microservice.demo.repository.BookDemoRepository;
import com.springboot.microservice.demo.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class QueryServiceImpl implements QueryService {

    @Resource
    private BookDemoRepository bookDemoRepository;

    @Override
    public String list() {
        return JSONObject.toJSONString(bookDemoRepository.findAll().toString());
    }

    @Override
    public String get(String name) {
        return null;
    }
}
