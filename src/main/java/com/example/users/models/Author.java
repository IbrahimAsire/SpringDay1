package com.example.users.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
public class Author {

    @NotEmpty(message = "ID it's empty")
    @Size(min = 2, max = 8, message = "It must be more than 2 and less than 9")
    private String ID;
    @NotEmpty(message = "Name it's empty")
    @Size(min = 3, max = 20, message = "It must be more than 2 and less than 21")
    private String name;
    @Email(message = "Syntax not correct")
    @NotEmpty(message = "Email is empty")
    private String email;
    @NotEmpty(message = "gender is empty")
    @Size(max = 1, message = "It should be one Char")
    private String gender;

}
