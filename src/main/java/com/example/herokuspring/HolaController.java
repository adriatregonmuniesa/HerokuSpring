package com.example.herokuspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaController {

    @GetMapping("/hola")
    @ResponseBody
    public String hola() {

        return "has hecho una peticion get";

    }

    @GetMapping("/formulario")
    public String hola2() {

        return "formulario";

    }

    @PostMapping("/holapost")
    @ResponseBody
    public String holaPost() {

        return "has hecho una peticion post";

    }
}
