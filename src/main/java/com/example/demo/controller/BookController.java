package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @RequestMapping("/book")
    public Book getBooks()
    {
        return  new Book("Dan Brown","Origin");
    }
}
