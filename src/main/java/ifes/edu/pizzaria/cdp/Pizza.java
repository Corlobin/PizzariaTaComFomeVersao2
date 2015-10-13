/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.cdp;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Pizza implements Cloneable {
    private Molho molho;
    private Recheio recheio;
    private Massa massa;

    public Molho getMolho() {
        return molho;
    }

    public void setMolho(Molho molho) {
        this.molho = molho;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    @Override
    public String toString() {
        return this.molho + " " + this.recheio + " " + this.massa;
    }
    
}
