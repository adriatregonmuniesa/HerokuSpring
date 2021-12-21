/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.herokuspring;

/**
 *
 * @author adriatregon
 */
public class AdministradorPlanta implements ControlEventListener {

    private int id;
    private String nom;
    private String telefon;
    private int recompte;
    
    public AdministradorPlanta() {
    }

    public AdministradorPlanta(int id, String nom, String telefon) {
        this.id = id;
        this.nom = nom;
        this.telefon = telefon;
        this.recompte=0;
    }

    public int getRecompte() {
        return recompte;
    }

    public void setRecompte(int recompte) {
        this.recompte = recompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public void llibreRetornat(EventObservable event) {
        
       System.out.println("L'Administrador de Planta "+nom+" notifica que s'ha retornat el llibre "+event.getLlibre().getTitol()+" de "+event.getLlibre().getAutor());
       System.out.println("------------------------------------------------------------");
       if (event.getLlibre().getEstat()==1){
           this.setRecompte(this.getRecompte()+1);
           System.out.println("L'Administrador de Planta "+nom+" notifica que el llibre "+event.getLlibre().getTitol()+" de "+event.getLlibre().getAutor() + " està malmès");
           System.out.println("Número de llibres malmesos a dia d'avui: "+this.getRecompte());
           System.out.println("------------------------------------------------------------");
       }
        
    }
    
}
