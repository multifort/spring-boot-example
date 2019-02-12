package com.springboot.microservice.demo.rest;

import com.springboot.microservice.demo.log.annonation.AuditLog;
import com.springboot.microservice.demo.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping(value = "/books", produces = "application/json; charset=UTF-8")
public class BookDemoController {

    @Resource
    private QueryService queryService;

    @GetMapping(value = "/list")
    @AuditLog
    @ResponseBody
    public String list(HttpServletRequest request){
        return queryService.list();
    }

    @GetMapping(value = "/{name}")
    @AuditLog
    @ResponseBody
    public String get(HttpServletRequest request, @PathVariable(value = "name")String name){
        return queryService.get(name);
    }
}
