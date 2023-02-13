package com.telusko.demo.dao;

import com.telusko.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{


}
