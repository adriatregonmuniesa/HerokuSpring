/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokuspring;

import java.util.ArrayList;

/**
 *
 * @author adriatregon
 */
public class Biblioteca {
    
    //Nom biblioteca:
    private String nom;

    //Llista de Llibres:
    private ArrayList<Llibre>llibres = new ArrayList();

    //Llista d'Administradors:
    private ArrayList<ControlEventListener>listeners = new ArrayList();

    public Biblioteca(String nom) {
        this.nom = nom;
    }

    public void afegirObservador(ControlEventListener ctrl){
        listeners.add(ctrl);
    }

    public void eliminarObservador(ControlEventListener ctrl){
        listeners.remove(ctrl);
    }

    public void afegirLLibre(Llibre ll){
        llibres.add(ll);
    }

    public void eliminarLLibre(Llibre ll){
        llibres.remove(ll);
    }

    public void retornarLlibre(Llibre ll){

        this.eliminarLLibre(ll);
        this.notificaLlibreRetornat(ll);

    }

    public void notificaLlibreRetornat(Llibre ll){

        EventObservable event = new EventObservable(this, ll);

        for(ControlEventListener x: listeners){
            x.llibreRetornat(event);
        }
    }

}
