package com.example.mvvmwithdatabinding.model;

public class User {

    private String userEmail;
    private String userPassword;
    public String userEmailHint;
    public String userPasswordHint;


    public User(String userEmail, String userPassword, String userEmailHint, String userPasswordHint) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userEmailHint = userEmailHint;
        this.userPasswordHint = userPasswordHint;
    }

    public User(String userEmailHint, String userPasswordHint) {
        this.userEmailHint = userEmailHint;
        this.userPasswordHint = userPasswordHint;
    }
}
