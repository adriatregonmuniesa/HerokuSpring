package com.example.herokuspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.StringWriter;

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
            //return "Valors: "+array[i];
            //System.out.println("Valors: "+array[i]);
        }

        return sw.toString();

    }

}
