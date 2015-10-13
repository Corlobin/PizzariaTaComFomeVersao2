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
    private static final HashMap<String, Builder> builders = new HashMap<>();    
    static {
        builders.put("Mussarela tradicional", new FabricaPizzaMussarelaBuilder());
        builders.put("Quatro queijos tradicional", new FabricaPizzaQuatroQueijosBuilder());
        builders.put("Mussarela cone", new FabricaPizzaMussarelaConeBuilder());
        builders.put("Quatro queijos cone", new FabricaPizzaQuatroQueijosConeBuilder());
    }
    public static Pizza criarPizza(String nome) {
        
        Cozinheiro cozinheiro = new Cozinheiro();
        Builder builder = builders.get(nome);
        Pizza pizza = cozinheiro.criarPizza(builder);
        return pizza;
    }
}
