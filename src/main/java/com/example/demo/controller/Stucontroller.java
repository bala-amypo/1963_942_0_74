package com.example.demo.controller;

@RestController
public class Stucontroller{
  @Autowired
  Stuservice stuservice;
  @postMapping("/postdata")
  public Stuentity postdata(@RequestBody Stuentity stuentity){
    return stuservice.saveStudent(stuentity);
  }
}