package com.example.users.controller;

import com.example.users.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {

    ArrayList<Book> books = new ArrayList<>();

    @GetMapping("book")
    public ArrayList getBook(){
        return books;
    }

    @PostMapping("book")
    public ArrayList<Book> postBook(@RequestBody Book book){
        books.add(book);
        return books;
    }

    @PutMapping("book/{id}")
    public ArrayList<Book> putBook(@PathVariable int index, @RequestBody Book book){
        books.set(index, book);
        return  books;
    }

    @DeleteMapping("book/{id}")
    public ArrayList<Book> deleteBook(@PathVariable int index){
        books.remove(index);
        return books;
    }

}
