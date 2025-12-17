package com.example.demo.serviceimplement;

import org.springframework.stereotype.Service;
import com.example.demo.service.Stuservice;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.Sturepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class Stuserviceimplement implements Stuservice{
   @Autowired
   Sturepository  sturepository;
   public Stuentity saveStudent(Stuentity stuentity){
     return sturepository.save(Stuentity);
   }
}