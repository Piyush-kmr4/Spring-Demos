package boot.orm.hibernate;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.orm.hibernate.model.Alien;






@Controller
public class HomeController {
	
	
	/*
	 * @Autowired private AlienDao dao;
	 */
	 
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home page requested");
		return "index";
	}
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Piyush");
	}
	
	
	
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		System.out.println("Inside the getAliens URL....");
		//m.addAttribute("result", dao.getAlien());
		return "showAliens";
		
	}
	
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m) {
		System.out.println("Inside the getAlien URL....to fetch record of Alien with aid: "+aid);
		//m.addAttribute("result", dao.getOneAlien(aid));
		return "showAliens";
		
	}
	
	
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute("result") Alien a) {
		//System.out.println(a.getAid()+"          "+a.getAname());
		//dao.addAlien(a);
		return "showAliens";
	}

}
