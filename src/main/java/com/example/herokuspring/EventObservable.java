/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokuspring;

import java.util.EventObject;

/**
 *
 * @author adriatregon
 */
public class EventObservable extends EventObject {
    
    Llibre llibre=null;

    public EventObservable(Biblioteca source, Llibre ll) {
        super(source);
        this.llibre = ll;
    }
    
    @Override
    public Biblioteca getSource(){
     
        return (Biblioteca) super.getSource();
                
    }
    
    public Llibre getLlibre() {
        return llibre;
    }

}
