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
public class Llibre {


    private int id;
    private String titol;
    private String autor;

    private int estat;
    
    public Llibre() {
    }

    public Llibre(int id, String titol, int estat, String autor) {
        this.id = id;
        this.titol = titol;
        this.estat = estat;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getEstat() {
        return estat;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

}
