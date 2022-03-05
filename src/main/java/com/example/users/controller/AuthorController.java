package com.example.users.controller;

import com.example.users.models.Author;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AuthorController {

    ArrayList<Author> authorList = new ArrayList<>();

    @GetMapping("author")
    public ArrayList<Author> getAuthor(){
        return authorList;
    }

    @PostMapping("author")
    public ArrayList<Author> postAuthor(@RequestBody Author author){
        System.out.println("done POST");
        authorList.add(author);
        return authorList;
    }

    @PutMapping("author/{id}")
    public ArrayList<Author> putAuthor(@PathVariable int index, @RequestBody Author author){
        System.out.println("done PUT");
        authorList.set(index, author);
        return authorList;
    }

    @DeleteMapping("author/{id}")
    public ArrayList<Author> deleteAuthor(@PathVariable int index){
        System.out.println("done DELETE");
        authorList.remove(index);
        return  authorList;
    }
}
