package com.example.herokuspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class HerokuSpringApplication {

    //int x = 2;
    //int[] array = new int[4];

    //public HerokuSpringApplication() {

      //  for(int i=0; i<array.length; i++){
        //    array[i]=i+i;
        //}
    //}


    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuSpringApplication.class, args);

    }

    @GetMapping("/Main")
    public String sayHello() {
        return "hello Main";
    }

    //void imprimirArray(){

      //  for(int i=0; i<array.length; i++){
        //    System.out.println("Valors: "+array[i]);
        //}

    //}

}
