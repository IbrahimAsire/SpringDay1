package com.example.users.controller;

import com.example.users.models.MyUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    ArrayList <MyUser> usersList=new ArrayList<>();

    @GetMapping("user")
    public ArrayList<MyUser> getUsers(){
        return usersList;
    }


    @PostMapping("user")
    public ArrayList<MyUser> addUser(@RequestBody MyUser user){
        System.out.println("Hey from POST user");
        usersList.add(user);
        return usersList;
    }


    @PutMapping("user/{id}")
    public ArrayList<MyUser> updateUser(@PathVariable int id, @RequestBody MyUser user){
        usersList.set(id,user);
        return usersList;
    }


    @DeleteMapping("user/{id}")
    public ArrayList<MyUser> deleteUser(@PathVariable int id){
        System.out.println("done D");
        usersList.remove(id);
        return usersList;
    }

}
