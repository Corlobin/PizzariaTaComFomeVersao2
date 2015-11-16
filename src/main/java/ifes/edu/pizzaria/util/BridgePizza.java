/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.Pizza;

public abstract class BridgePizza {
    
    public Builder pizza;

    public BridgePizza(Builder pizza) {
        this.pizza = pizza;
    }
    
    public void fazerMassa() {
        pizza.prepararMassa();
    }
    public void fazerRecheio() {
       pizza.prepararRecheio();
    }
    public void fazerMolho() {
        pizza.prepararMolho();
    }
    public void fazerPizza() {
        pizza.colocarForno();
    }
    
}
