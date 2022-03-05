package com.example.users.controller;

import com.example.users.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    ArrayList<Book> books = new ArrayList<>();

    @GetMapping("book")
    public ArrayList getBook(){
        return books;
    }


}
