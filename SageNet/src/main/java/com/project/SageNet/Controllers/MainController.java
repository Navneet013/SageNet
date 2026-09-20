package com.project.SageNet.Controllers;

import com.project.SageNet.Models.User;
import com.project.SageNet.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private Service service;

    @PostMapping("api/add_user")
    public ResponseEntity<?> add_user(@RequestBody User user){
        return new ResponseEntity<>(service.add_user(user) , HttpStatus.CREATED);
    }

    @GetMapping("/user/{name}")
    public ResponseEntity<?> see_user(@PathVariable String name){
        return new ResponseEntity<>(service.find_user(name) , HttpStatus.FOUND);
    }

    @GetMapping("test")
    public String general_output(){
        return "working";
    }
}
