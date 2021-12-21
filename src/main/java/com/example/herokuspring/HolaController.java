package com.example.herokuspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaController {

    @GetMapping("/hola")
    @ResponseBody
    public String hola() {
        return "has fet una petició get";
    }

    @PostMapping("/holapost")
    @ResponseBody
    public String holaPost() {
        return "has fet una petició post ";

    }

    @GetMapping("/index")
    public void index() { }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }
}
