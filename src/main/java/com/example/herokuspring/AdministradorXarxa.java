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
public class AdministradorXarxa implements ControlEventListener{

    private int id;
    private String nom;
    private String correu;
    
    public AdministradorXarxa(int id, String nom, String correu) {
        this.id = id;
        this.nom = nom;
        this.correu = correu;
    }

    public AdministradorXarxa() {
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

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    @Override
    public void llibreRetornat(EventObservable event) {
        System.out.println("L'Administrador de Xarxa "+nom+" notifica que s'ha retornat el llibre "+event.getLlibre().getTitol()+" de "+event.getLlibre().getAutor());
        System.out.println("------------------------------------------------------------");
        if (event.getLlibre().getEstat()==1){
           System.out.println("L'Administrador de Xarxa "+nom+" notifica que el llibre "+event.getLlibre().getTitol()+" de "+event.getLlibre().getAutor() + " està malmès");
           System.out.println("S'envia informe a la Policia: ");
           System.out.println("     'El llibre "+event.getLlibre().getTitol()+" de "+event.getLlibre().getAutor() + " està malmès i exigim mort per garrote vil'");
           System.out.println("------------------------------------------------------------");
       }
        
    }
    
    
    
}
