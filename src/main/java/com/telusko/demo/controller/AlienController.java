package com.telusko.demo.controller;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @DeleteMapping("/alien/{aid}")
   public String deleteAlien(@PathVariable int aid) {
        Alien a = repo.getOne(aid);
        repo.delete(a);

        return "deleted";
   }

    @PostMapping(path= "/alien", consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }

    @GetMapping(path="/aliens")
    public List<Alien> getAliens()
    {
        return repo.findAll();
    }
    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid)
    {
        return repo.findById(aid);
    }
}
