package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stuentity{
    @Id  //indicates unique person
    @GeneratedValue(stragy=GenerationType.IDENTITY) //puthu puthu users ku athuvae oru identity kudukum(inbuilt) and auto is default
    private Long id; //this is primary key
    private String name;
    private String email;
    private float cgpa;
    //getter and setter
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    //
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    //
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    //constructor
    public Stuentity(Long id,String name,String email,float cgpa){
        this.id=id;
        this.name=name;
        this.email=email;
        this.cgpa=cgpa;

    }
    //default constructor
    public Stuentity(){

    }
}