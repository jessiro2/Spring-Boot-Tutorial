package com.telusko.demo.dao;

import com.telusko.demo.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
