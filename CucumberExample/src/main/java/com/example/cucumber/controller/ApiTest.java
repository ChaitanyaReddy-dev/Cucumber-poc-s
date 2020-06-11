package com.example.cucumber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

    @GetMapping("/student/{id}")
    public StudentModel Stub(@PathVariable  int id){

        StudentModel model=new StudentModel("1","chaitanya");


        return model;
    }

    @GetMapping("/teacher/{id}")
    public StudentModel Stub1(@PathVariable  int id){

        StudentModel model=new StudentModel("1","rakesh");


        return model;
    }
}
