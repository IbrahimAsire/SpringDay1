package com.example.users.Service;

import com.example.users.models.Author;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {
    private ArrayList<Author> authors=new ArrayList<>();

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public boolean updateAuthor(Integer index, Author author){
        if(index >= authors.size()){
            return false;
        }
        authors.set(index, author);
        return true;
    }

    public boolean deleteAuthor(Integer index){
        if(index >= authors.size()){
            return false;
        }
        authors.remove(index);
        return true;
    }
}

