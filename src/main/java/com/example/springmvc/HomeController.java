package com.example.springmvc;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2")int j,HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");

        int sum = i+j;
        mv.addObject("sum",sum);

        return mv;
    }

}
