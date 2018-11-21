package com.multifort.spring.liquibase.service;

import com.multifort.spring.liquibase.domain.Person;
import com.multifort.spring.liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: langzi
 * @Date: Created on 2018/9/4
 * @Description:
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> list() {
        return repository.findAll();
    }
}
