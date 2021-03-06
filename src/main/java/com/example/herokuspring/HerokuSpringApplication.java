package com.example.herokuspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.StringWriter;
import java.util.Date;

@Controller
@SpringBootApplication
public class HerokuSpringApplication {

    int x = 2;
    int[] array = new int[4];


    public HerokuSpringApplication() {

        for(int i=0; i<array.length; i++){
            array[i]=i+i;
        }
    }

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuSpringApplication.class, args);

    }

    @RequestMapping("/imprimirArray")
    @ResponseBody
    String imprimirArray(){

        StringWriter sw = new StringWriter();

        for(int i=0; i<array.length; i++){
            sw.write(array[i] +" ");
        }

        return sw.toString();

    }

    @GetMapping("/formulari")
    //@RequestMapping(value = "array", method = RequestMethod.GET)
    public String forms(Model model) {

        String[] continents = {
                "Africa", "Antarctica", "Asia", "Australia",
                "Europe", "North America", "South America"
        };

        model.addAttribute("continents", continents);

        return "formulari";

    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }

    @GetMapping("/Observador")
    public String observador(Model model) {
        model.addAttribute("message", new ExerciciBiblioteca() );
        return "Observador";
    }



}
