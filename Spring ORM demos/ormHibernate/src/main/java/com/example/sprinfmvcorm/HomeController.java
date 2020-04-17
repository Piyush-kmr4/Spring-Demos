package com.example.sprinfmvcorm;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.springmvcorm.models.Alien;
import com.example.springmvorm.dao.AlienDao;




@Controller
public class HomeController {
	
	
	
	  @Autowired 
	  private AlienDao dao;
	 
	 
	
	
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
		m.addAttribute("result", dao.getAlien());
		return "showAliens";
		
	}
	
	@RequestMapping("add")
	/*public String add(HttpServletRequest req) {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int num3 = i+j;
		HttpSession session = req.getSession();
		session.setAttribute("num3", num3);
		
		return "result.jsp";
	}*/
	
	/*public String add(@RequestParam("num1") int i,@RequestParam("num2")int j,HttpSession session) {
		int num3= i+j;
		session.setAttribute("num3", num3);
		return "result.jsp";
	}*/
	
	/*
	 * public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2")int
	 * j) {
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.setViewName("result"); int num3 =
	 * i+j; mv.addObject("num3", num3); return mv; }
	 */
	
	
	
	//GetMethods
	
	
	
	/*
	 * @RequestMapping(value="addAlien",method=RequestMethod.POST) public String
	 * addAlien(@ModelAttribute("alien") Alien a) {
	 * //System.out.println(a.getAid()+"          "+a.getAname()); return "result";
	 * }
	 */
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute("alien") Alien a) {
		//System.out.println(a.getAid()+"          "+a.getAname());
		return "result";
	}

}
