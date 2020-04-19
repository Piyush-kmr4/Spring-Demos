package com.hibernate.orminboot;

import com.hibernate.orminboot.model.Alien;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;

    @GetMapping(path="aliens",produces = {"application/xml"})
    //@ResponseBody
    public List<Alien> getAliens(){
        List<Alien> aliens = repo.findAll();

        System.out.println("Fetching Aliens....");
        return aliens;
    }

    @GetMapping("alien/{aid}")
    //@ResponseBody
    public Alien getALien(@PathVariable("aid") int aid){
        Alien a =repo.findById(aid).orElse(new Alien(0,""));
        return a;
    }

    @PostMapping(path="alien",consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien a){
        repo.save(a);
        return a;
    }
}
