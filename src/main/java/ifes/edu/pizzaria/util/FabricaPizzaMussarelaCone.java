/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class FabricaPizzaMussarelaCone implements Fabrica {

    @Override
    public Pizza criarMassa(Pizza pizza) {
        pizza = new PizzaMassaCone(pizza);
        return pizza;               
    }

    @Override
    public Pizza criarRecheio(Pizza pizza) {
        pizza = new PizzaQueijoMussarela(pizza);
        pizza = new PizzaQueijoGorgonzola(pizza);
        pizza = new PizzaCebola(pizza);
        pizza = new PizzaPresunto(pizza);
        return pizza;
    }

    @Override
    public Pizza criarMolho(Pizza pizza) {
        pizza = new PizzaMolhoTomate(pizza);
        return pizza;
    }

    @Override
    public Pizza criarPizza() {
        return new Pizza();
    }
    
}
