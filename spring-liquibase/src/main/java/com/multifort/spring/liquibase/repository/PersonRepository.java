package com.multifort.spring.liquibase.repository;

import com.multifort.spring.liquibase.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: langzi
 * @Date: Created on 2018/9/4
 * @Description:
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
