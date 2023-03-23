package com.spring.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

import com.spring.spring.model.Books;
 @Repository
public interface Bookrepository extends JpaRepository<Books,Integer> {


    
}
