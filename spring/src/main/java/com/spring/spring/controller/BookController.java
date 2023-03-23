package com.spring.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.model.Books;
import com.spring.spring.service.BookService;

@RestController
@EnableAspectJAutoProxy(proxyTargetClass=true) 

public class BookController {
    @Autowired  
BookService booksService;  

@GetMapping("/book")
public List<Books> getAllBooks()   
{  
return booksService.getAllBooks();  
}  

@GetMapping("/book/{bookid}")
public Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksService.getBooksById(bookid);  
}  

@DeleteMapping("/book/{bookid}")
public void deleteBook(@PathVariable("bookid") int bookid)   
{  
booksService.delete(bookid);  
}  

@PostMapping("/books")  
public int saveBook(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}  

@PutMapping("/books")
public Books update(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}

 

}


 

