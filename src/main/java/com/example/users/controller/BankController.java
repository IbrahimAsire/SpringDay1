package com.example.users.controller;

import com.example.users.models.Author;
import com.example.users.models.BankAccount;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/")
public class BankController {

    ArrayList <BankAccount> accountsList=new ArrayList<>();

    @GetMapping("account")
    public ResponseEntity getAccounts(){
        return ResponseEntity.status(200).body(accountsList);
    }


    @PostMapping("account")
    public ResponseEntity addAccount(@RequestBody @Valid BankAccount account, Errors errors){
        if(errors.hasErrors()){
            return ResponseEntity.status(400).body(errors.getFieldError());
        }
        accountsList.add(account);
        return ResponseEntity.status(201).body("Post Done");
    }


    @PutMapping("account/{id}")
    public ArrayList<BankAccount> updateAccount(@PathVariable Integer id, @RequestBody BankAccount account){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.set(i,account);
                break;
            }
        }
        return accountsList;
    }


    @DeleteMapping("account/{id}")
    public ArrayList<BankAccount> deleteAccount(@PathVariable Integer id){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.remove(i);
                break;
            }
        }
        return accountsList;
    }

    @PostMapping("account/deposit/{id}")
    public ArrayList<BankAccount> deposit(@PathVariable Integer id, @RequestBody Double amount){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                Double oldBalance=accountsList.get(i).getBalance();
                accountsList.get(i).setBalance(oldBalance+amount);
                break;
            }
        }
        return accountsList;
    }

    @PostMapping("account/withdraw/{id}")
    public ArrayList<BankAccount> withdraw(@PathVariable Integer id, @RequestBody Double amount){
        for (BankAccount bankAccount : accountsList) { //this is enhanced 'for', same the above
            if (bankAccount.getId().equals(id)) {
                Double oldBalance = bankAccount.getBalance();
                bankAccount.setBalance(oldBalance - amount);
                break;
            }
        }
        return accountsList;
    }




}
