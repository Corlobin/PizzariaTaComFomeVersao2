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
public class Recheio {
    private ArrayList<Ingrediente> ingrediente;

    public Recheio(ArrayList<Ingrediente> ingredientes) {
        this.ingrediente = ingredientes;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (Ingrediente i: ingrediente){
            st.append(i).append(" ");
        }
        return st.toString();
    }
    
}
