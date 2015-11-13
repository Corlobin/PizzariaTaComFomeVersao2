/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;


import ifes.edu.pizzaria.cdp.AbstractPizzaOption;
import ifes.edu.pizzaria.cdp.Pizza;

/**
 *
 * @author Ricardo
 */
public class BuilderAbstrato implements Builder {
    Pizza pizza = new Pizza();
    protected Fabrica fabrica;
    
    @Override
    public void prepararMassa() {
        pizza = fabrica.criarMassa(pizza);
    }

    @Override
    public void prepararRecheio() {
        pizza = fabrica.criarRecheio(pizza);
    }

    @Override
    public void prepararMolho() {
        pizza = fabrica.criarMolho(pizza);
    
    }

    @Override
    public Pizza colocarForno() {
        return pizza;
    }
    
}
