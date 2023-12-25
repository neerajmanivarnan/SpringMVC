package com.example.springmvc;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.modal.Alien;


@Controller
public class HomeController {
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

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("a1") Alien a){
        
        return "result.jsp";
    }

}
