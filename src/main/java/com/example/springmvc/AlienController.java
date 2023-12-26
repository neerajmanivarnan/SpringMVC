package com.example.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springmvc.modal.Alien;
import com.example.springmvc.modal.AlienRepo;

@Controller
@ResponseBody
public class AlienController {
    @Autowired
    AlienRepo repo;

    
    @GetMapping("aliens")
    public String getAliens(){
        List<Alien> aliens = repo.findAll();

        return aliens.toString();
    }
}
