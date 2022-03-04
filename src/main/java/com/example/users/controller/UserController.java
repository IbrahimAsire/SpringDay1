package com.example.users.controller;

import com.example.users.models.BankAccount;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    ArrayList <BankAccount> usersList=new ArrayList<>();

    @GetMapping("user")
    public ArrayList<BankAccount> getUsers(){
        return usersList;
    }


    @PostMapping("user")
    public ArrayList<BankAccount> addUser(@RequestBody BankAccount user){
        System.out.println("Hey from POST user");
        usersList.add(user);
        return usersList;
    }


    @PutMapping("user/{id}")
    public ArrayList<BankAccount> updateUser(@PathVariable int index, @RequestBody BankAccount user){
        usersList.set(index,user);
        return usersList;
    }


    @DeleteMapping("user/{id}")
    public ArrayList<BankAccount> deleteUser(@PathVariable int index){
        usersList.remove(index);
        return usersList;
    }

}
