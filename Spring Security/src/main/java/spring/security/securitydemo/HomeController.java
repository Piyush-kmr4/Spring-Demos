package spring.security.securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController{
    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("result","Normal");
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping("/user")
    public ModelAndView homeUser(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("result","USER");
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping("/admin")
    public ModelAndView homeAdmin(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("result","ADMIN");
        mv.setViewName("home");
        return mv;
    }
}
