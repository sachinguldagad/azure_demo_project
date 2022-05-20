package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.kubernetes.feign.UserFeign;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {

	@Autowired
	UserFeign userFeign;
	
    @Value("${message:Welcome to Youtube}")
    private String message;

    @GetMapping
    public String welcome() {
    	message = message + userFeign.getUsers();
        System.out.println(message);
        return message;
    }
    
    
}
