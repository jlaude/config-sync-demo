package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldApplicationController {
    

    @GetMapping("/")
    String hello(Model model) {
            return "index";
    }

}
