package com.multifort.spring.liquibase.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: langzi
 * @Date: Created on 2018/9/4
 * @Description:
 */
@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstname", length = 50)
    private String firstname;

    @Column(name = "lastname", length = 50)
    private String lastname;

    @Column(name = "state", length = 50)
    private String state;
}
