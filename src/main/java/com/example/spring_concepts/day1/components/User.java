package com.example.spring_concepts.day1.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class User {

    private String userName;
    private String emailId;

//    public User() {
//        log.info("User bean creation started");
////        userName = "Joseph";
////        emailId = "j@gmail.com";
//    }


    public User(String userName, String email) {
        log.info("User bean creation started with email and username");
        this.emailId = email;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }



}
