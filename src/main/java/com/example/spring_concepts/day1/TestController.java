package com.example.spring_concepts.day1;

import com.example.spring_concepts.day1.components.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class TestController {

    User user = new User("Joseph", "a@gmail.com");

    public TestController() {
        log.info("Created  TestController bean");
        log.info("emailId & userName of user  : {} {}", this.user.getEmailId(), this.user.getUserName());
    }



//    public TestController() {
//        log.info("Creating TestController bean");
//    }
}
