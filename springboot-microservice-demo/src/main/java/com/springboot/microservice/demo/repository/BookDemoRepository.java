package com.springboot.microservice.demo.repository;

import com.springboot.microservice.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDemoRepository extends JpaRepository<Book, Integer> {

}
