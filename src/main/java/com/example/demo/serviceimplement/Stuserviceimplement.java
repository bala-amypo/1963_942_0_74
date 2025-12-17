package com.example.demo.serviceimplement;

import org.springframework.stereotype.Service;
import com.example.demo.service.Stuservice;
import com.example.demo.entity.Stuentity;
@Service
public class Stuserviceimplement implements Stuservice{
   @Autowired
   private Sturepository 
   public Stuentity saveStudent(Stuentity stuentity){
     return sturepository.save(Stuentity);
   }
}