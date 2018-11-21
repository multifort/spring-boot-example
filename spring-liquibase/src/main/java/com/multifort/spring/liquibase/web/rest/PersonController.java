package com.multifort.spring.liquibase.web.rest;

import com.multifort.spring.liquibase.domain.Person;
import com.multifort.spring.liquibase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: langzi
 * @Date: Created on 2018/9/4
 * @Description:
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "/person")
    public List<Person> list(){
        return service.list();
    }
}
