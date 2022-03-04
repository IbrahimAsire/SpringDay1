package com.example.users.models;

public class MyUser {
    private String user;
    private String passWord;
    private String id;
    private String role;

    public MyUser(String user, String passWord, String id, String role) {
        this.user = user;
        this.passWord = passWord;
        this.id = id;
        this.role = role;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
