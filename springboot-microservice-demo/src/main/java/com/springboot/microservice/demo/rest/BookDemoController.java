package com.springboot.microservice.demo.rest;

import com.springboot.microservice.demo.log.annonation.AuditLog;
import com.springboot.microservice.demo.service.QueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@Api(value = "book application operation", description = "Spring boot microservice book application operation")
@RequestMapping(value = "/api/v1", produces = "application/json; charset=UTF-8")
public class BookDemoController {

    @Resource
    private QueryService queryService;

    @ApiOperation(value = "获取书籍列表信息", response = String.class, notes = "获取书籍列表信息")
    @GetMapping(value = "/books")
    @AuditLog
    @ResponseBody
    public String list(){
        return queryService.list();
    }

    @ApiOperation(value = "获取书籍详情", response = String.class, notes = "获取书籍详情")
    @ApiImplicitParam(required = true, name = "name", value = "书籍名称", defaultValue = "", paramType = "path")
    @GetMapping(value = "/book/{name}")
    @AuditLog
    @ResponseBody
    public String get(@PathVariable(value = "name")String name){
        return queryService.get(name);
    }
}
