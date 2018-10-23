package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {


    @RequestMapping("/book")
    public List<Book> getBooks()
    {
        List<Book> book = new ArrayList<>();

        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        book.add(new Book("Dan Brown","Origin"));
        return book;
    }

    @RequestMapping(method= RequestMethod.POST,value ="/save")
    public String saveBook(@RequestBody Book b){

        return "Your "+b.getBookName()+"book   saved"  ;

    }
}
