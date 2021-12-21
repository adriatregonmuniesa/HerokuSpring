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
public class ExerciciBiblioteca {

    public ExerciciBiblioteca() {

        Biblioteca bl = new Biblioteca("Pompeu Fabra");

        Llibre ll1 = new Llibre(1,"Les aventures de Tom Sawyer",1,"Mark Twain");
        Llibre ll2 = new Llibre(2,"Les aventures de Huckleberry Finn",0,"Mark Twain");
        Llibre ll3 = new Llibre(3,"Cap de suro Wilson",1,"Mark Twain");

        bl.afegirLLibre(ll1);
        bl.afegirLLibre(ll2);
        bl.afegirLLibre(ll3);

        AdministradorPlanta adp = new AdministradorPlanta(1, "Sergi Martí", "678729172");
        AdministradorXarxa adx = new AdministradorXarxa(2, "Roberto Lago", "roberto.lago@xtec.cat");

        bl.afegirObservador(adp);
        bl.afegirObservador(adx);

        bl.retornarLlibre(ll1);
        bl.retornarLlibre(ll2);
        bl.retornarLlibre(ll3);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca bl = new Biblioteca("Pompeu Fabra");
        
        Llibre ll1 = new Llibre(1,"Les aventures de Tom Sawyer",1,"Mark Twain");
        Llibre ll2 = new Llibre(2,"Les aventures de Huckleberry Finn",0,"Mark Twain");
        Llibre ll3 = new Llibre(3,"Cap de suro Wilson",1,"Mark Twain");
        
        bl.afegirLLibre(ll1);
        bl.afegirLLibre(ll2);
        bl.afegirLLibre(ll3);
        
        AdministradorPlanta adp = new AdministradorPlanta(1, "Sergi Martí", "678729172");
        AdministradorXarxa adx = new AdministradorXarxa(2, "Roberto Lago", "roberto.lago@xtec.cat");
        
        bl.afegirObservador(adp);
        bl.afegirObservador(adx);
        
        bl.retornarLlibre(ll1);
        bl.retornarLlibre(ll2);
        bl.retornarLlibre(ll3);
    }
    
}
