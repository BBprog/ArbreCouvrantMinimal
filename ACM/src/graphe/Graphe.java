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
public class Graphe {
    private Vector<Sommet> sommets;
    private Vector<Arrete> arretes;
    
    public Graphe() {
        this.sommets = new Vector<Sommet>();
        this.arretes = new Vector<Arrete>();
    }
    
    public boolean existeSommet(Sommet ss) {
        for (Sommet s : sommets) {
            if (s.equals(ss)) return true;
        }
        return false;
    }
    
    public boolean existeArrete(Arrete aa) {
        for (Arrete a : arretes) {
            if (a.equals(aa)) return true;
        }
        return false;
    }
    
    public void ajouterSommet(Sommet s) {
        if (!existeSommet(s))
            sommets.add(s);
    }
    
    public void ajouterArrete(Sommet s1, Sommet s2, int value) {
        ajouterSommet(s1);
        ajouterSommet(s2);
        Arrete a = new Arrete(s1, s2, value);
        if (!existeArrete(a)) {
            arretes.add(a);
            s1.ajouterArrete(a);
            s2.ajouterArrete(a);
        }
    }
    
    public void ajouterArrete(Arrete a) {
        if (!existeArrete(a))
            arretes.add(a);
    }
    
    public void enleverArrete(Arrete aa) {
        for (Arrete a : arretes)
            if (a.equals(aa)) arretes.remove(a);
    }
    
    public Vector<Arrete> getVoisins(Sommet s) {
        Vector<Arrete> arretesVoisines = new Vector<Arrete>();
        for (Arrete a : arretes) {
            if (a.sommetEstDansArrete(s))
                arretesVoisines.add(a);
        }
        return arretesVoisines;
    }
    
    public Graphe copie() {
        Graphe grapheCpy = new Graphe();
        for (Arrete a : arretes)
            grapheCpy.ajouterArrete(a);
        return grapheCpy;
    }
    
    public Vector<Sommet> getSommets() {
        return sommets;
    }
    
    public Vector<Arrete> getArretes() {
        return arretes;
    }

    @Override
    public String toString() {
        return "Graphe{" + "sommets=" + sommets + ", arretes=" + arretes + '}';
    }
    
}
