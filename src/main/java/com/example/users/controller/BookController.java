package com.example.users.controller;

import com.example.users.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/")
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

    @PutMapping("book/{index}")
    public ArrayList<Book> updateBook(@PathVariable Integer index, @RequestBody Book book){
        books.set(index, book);
        return  books;
    }

    @DeleteMapping("book/{index}")
    public ArrayList<Book> deleteBook(@PathVariable Integer index){
        books.remove(index);
        return books;
    }

}
