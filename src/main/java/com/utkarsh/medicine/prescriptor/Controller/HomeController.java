package com.utkarsh.medicine.prescriptor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


   @RequestMapping("/home")
    public String getHomepage( ){
        System.out.println("Hello");
     return "index";
    }

    @RequestMapping("/1")
    public void showfever(){
       System.out.println("fever");

    }



}
