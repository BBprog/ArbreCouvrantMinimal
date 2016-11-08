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
public class Arrete implements Comparable {
    private Sommet s1, s2;
    private Integer value;
    
    public Arrete(Sommet s1, Sommet s2, int value) {
        this.s1 = s1;
        this.s2 = s2;
        this.value = value;
    }
    
    public boolean sommetEstDansArrete(Sommet s) {
        return this.s1.equals(s) || this.s2.equals(s);
    }
    
    public boolean equals(Object o) {
        Arrete a = (Arrete) o;
        return (this.s1.equals(a.s1) && this.s2.equals(a.s2))
                || (this.s1.equals(a.s2) && this.s2.equals(a.s1));
    }

    @Override
    public String toString() {
        return "Arrete{" + "s1=" + s1 + ", s2=" + s2 + ", value=" + value + '}';
    }

    @Override
    public int compareTo(Object o) {
        Arrete a = (Arrete) o;
        return this.value.compareTo(a.value);
    }
    
}
