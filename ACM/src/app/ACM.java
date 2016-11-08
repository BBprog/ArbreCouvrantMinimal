/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import graphe.Graphe;
import graphe.Sommet;

/**
 *
 * @author Bprog
 */
public class ACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graphe g = new Graphe();
        
        g.ajouterSommet(new Sommet("a"));
        g.ajouterSommet(new Sommet("b"));
        
        g.ajouterArrete(new Sommet("a"), new Sommet("c"), 5);
        g.ajouterArrete(new Sommet("a"), new Sommet("b"), 1);
        g.ajouterArrete(new Sommet("c"), new Sommet("d"), 3);
        g.ajouterArrete(new Sommet("a"), new Sommet("d"), 4);
        g.ajouterArrete(new Sommet("c"), new Sommet("e"), 2);
        g.ajouterArrete(new Sommet("c"), new Sommet("b"), 2);
        g.ajouterArrete(new Sommet("b"), new Sommet("e"), 4);
        
        System.out.println(g.toString());
        
                
    }
    
}
