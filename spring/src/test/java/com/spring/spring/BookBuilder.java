package com.spring.spring;

import com.spring.spring.model.Books;

public class BookBuilder {
    private Books book = new Books();
    
    public BookBuilder bookid(int bookid)
    {
        book.setBookid(bookid);
        return this;
    }
    public BookBuilder author(String author)
    {
        book.setAuthor(author);
        return this;
    }
    public BookBuilder bookname(String bookname)
    {
        book.setBookname(bookname);
        return this;
    }
    public BookBuilder price(int price)
    {
        book.setPrice(price);
        return this;
    }
    public Books build(){
         return book;
         }
   
}
