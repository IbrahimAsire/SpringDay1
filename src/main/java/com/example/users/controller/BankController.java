package com.example.users.controller;

import com.example.users.models.BankAccount;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BankController {

    ArrayList <BankAccount> accountsList=new ArrayList<>();

    @GetMapping("account")
    public ArrayList<BankAccount> getAccounts(){
        return accountsList;
    }


    @PostMapping("account")
    public ArrayList<BankAccount> addAccount(@RequestBody BankAccount account){
        accountsList.add(account);
        return accountsList;
    }


    @PutMapping("account/{id}")
    public ArrayList<BankAccount> updateAccount(@PathVariable String id, @RequestBody BankAccount account){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.set(i,account);
                break;
            }
        }
        return accountsList;
    }


    @DeleteMapping("account/{id}")
    public ArrayList<BankAccount> deleteAccount(@PathVariable String id){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                accountsList.remove(i);
                break;
            }
        }
        return accountsList;
    }

    @PostMapping("account/deposit/{id}")
    public ArrayList<BankAccount> deposit(@PathVariable String id, @RequestBody Double amount){
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
    public ArrayList<BankAccount> withdraw(@PathVariable String id, @RequestBody Double amount){
        for (int i = 0; i < accountsList.size(); i++) {
            if(accountsList.get(i).getId().equals(id)){
                Double oldBalance=accountsList.get(i).getBalance();
                accountsList.get(i).setBalance(oldBalance-amount);
                break;
            }
        }
        return accountsList;
    }




}
