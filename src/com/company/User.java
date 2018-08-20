package com.company;

/**
 * Created by Kaczmarczyk on 2018-08-19.
 */
public class User {

    String login;
    String password;
    String email;
    int age;

    public User() {
        login = "login";
        password = "pass";
        email = "mail@example.com";
        age = 0;
    }

    public User(String login, String pass, String email, int age) {
        this.login = login;
        password = pass;
        this.email = email;
        this.age = age;
    }
}