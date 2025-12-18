package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Stuentity;
import com.example.demo.service.Stuservice;

@RestController
public class Stucontroller{
  @Autowired
  Stuservice stuservice;
  @PostMapping("/save")
  public Stuentity postdata(@RequestBody Stuentity stuentity){
    return stuservice.saveStudent(stuentity);
  }
}