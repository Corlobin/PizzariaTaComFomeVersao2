/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.Pizza;
import java.util.HashMap;

/**
 *
 * @author Ricardo
 */
public class FabricaPizza { 
    public static Pizza criarPizza(String nome) {  
        Cozinheiro cozinheiro = new Cozinheiro();
        PizzaFlyweightFactory factory = new PizzaFlyweightFactory();        
        Builder builder = factory.getBuilder(nome);
        BridgePizza bridge = new BridgePizzaImpl(builder);
        Pizza pizza = cozinheiro.criarPizza(bridge);
        return pizza;
    }
}
