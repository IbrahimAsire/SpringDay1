package com.example.users.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
public class BankAccount {

    @NotEmpty(message = "Name is empty!")
    @Size(min = 3, max = 20, message = "Name is short Or long")
    private String name;
    @NotEmpty(message = "ID is empty")
    @Size(min = 2, max = 8, message = "ID is short OR long!")
    private String id;
    @NotEmpty(message = "Balance is empty!")
    private Double balance;

}
