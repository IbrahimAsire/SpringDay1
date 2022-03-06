package com.example.users.controller;

import com.example.users.Service.AuthorService;
import com.example.users.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("author")
    public ResponseEntity getAuthor(){
        return ResponseEntity.status(200).body(authorService.getAuthors());
    }

    @PostMapping("author")
    public ResponseEntity addAuthor(@RequestBody @Valid Author author, Errors errors){
        if(errors.hasErrors()){
            return ResponseEntity.status(400).body(errors.getFieldError());
        }
        System.out.println("done POST");
        authorService.addAuthor(author);
        return ResponseEntity.status(201).body("Author created");
    }

    @PutMapping("author/{index}")
    public ResponseEntity updateAuthor(@PathVariable Integer index, @RequestBody @Valid Author author){
        boolean isAuthorUpdate = authorService.updateAuthor(index, author);
        if(!isAuthorUpdate){
            return ResponseEntity.status(400).body("Index is out array");
        } else {
            return ResponseEntity.status(200).body("author updated");
        }
    }

    @DeleteMapping("author/{index}")
    public ResponseEntity deleteAuthor(@PathVariable Integer index){
        boolean isAuthorDelete = authorService.deleteAuthor(index);
        if(!isAuthorDelete){
            return ResponseEntity.status(400).body("Index is out array");
        } else {
            return  ResponseEntity.status(200).body("Author deleted");
        }
    }
}
