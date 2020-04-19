package com.hibernate.orminboot;

import com.hibernate.orminboot.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("getAliens")
    public String getAliens(Model m){
        m.addAttribute("result",repo.findAll());
        return "showAliens";
    }

    @RequestMapping("getAlien")
    public String getAlien(Model model,@RequestParam int aid){
        model.addAttribute("result",repo.getOne(aid));
        return "showAliens";
    }

    @RequestMapping("getAlienByName")
    public String getAlienByName(Model model,@RequestParam String aname){
        model.addAttribute("result",repo.find(aname));
        return "showAliens";
    }

    @RequestMapping("addAlien")
    public String addAlien(Model m, Alien a){
        repo.save(a);
        m.addAttribute("result","Alien added");
        return "showAliens";
    }

    @RequestMapping("removeAlien")
    public String removeAlien(Model m, @RequestParam int aid){
        repo.deleteById(aid);
        m.addAttribute("result","Alien with aid: "+aid+" is removed!");
        return "showAliens";
    }
}
