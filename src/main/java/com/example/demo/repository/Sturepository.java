package com.example.demo.repository;

import org.springframework.data.jpa.repository.Jparepository;
import com.example.demo.entity.Stuentity;
@Repository
public interface Sturepository extends Jparepository<Stuentity,long>{

}