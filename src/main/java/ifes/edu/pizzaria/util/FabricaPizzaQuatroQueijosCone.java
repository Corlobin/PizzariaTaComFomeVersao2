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
public class FabricaPizzaQuatroQueijosCone implements Fabrica {

    @Override
    public Pizza criarMassa(Pizza pizza) {
        pizza = new PizzaMassaTradicional(pizza);
        return pizza;               
    }

    @Override
    public Pizza criarRecheio(Pizza pizza) {
        pizza = new PizzaQueijoParmesao(pizza);
        pizza = new PizzaQueijoMussarela(pizza);
        pizza = new PizzaQueijoMargherita(pizza);
        pizza = new PizzaQueijoProvolone(pizza);
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
