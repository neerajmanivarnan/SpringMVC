package com.example.springmvc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.modal.Alien;


@Controller
public class HomeController {
    @Autowired
    private modayRepo repo;
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2")int j){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");

        int sum = i+j;
        mv.addObject("sum",sum);

        return mv;
    }

    @GetMapping("getAliens")
public String getAliens(Model m){
  // List aliens =  Arrays.asList(new Alien(102,"Neeraj"),new Alien(103,"Manivarnan"));
   m.addAttribute("aliens", repo.findAll());
   
   
    return "showAliens.jsp";
}


    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute("a1") Alien a){

        return "result.jsp";
    }

}
