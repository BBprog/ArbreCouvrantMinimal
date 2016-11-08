/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphe;

import java.util.Vector;

/**
 *
 * @author Bprog
 */
public class Sommet {
    private String name;
    private Vector<Arrete> arretes;
    
    public Sommet(String name) {
        this.name = name;
        this.arretes = new Vector<Arrete>();
    }
    
    void ajouterArrete(Arrete a) {
        arretes.add(a);
    }

    public boolean equals(Object o) {
        Sommet s = (Sommet) o;
        return this.name.equals(s.name);
    }

    @Override
    public String toString() {
        return "Sommet{" + "name=" + name + '}';
    }
    
}
