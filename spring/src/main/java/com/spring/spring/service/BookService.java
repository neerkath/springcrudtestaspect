package com.spring.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring.spring.model.Books;
import com.spring.spring.repository.Bookrepository;

@Service
public class BookService {
    @Autowired
    Bookrepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    public void update(int bookid, Books books) {
        booksRepository.save(books);
    }
}
