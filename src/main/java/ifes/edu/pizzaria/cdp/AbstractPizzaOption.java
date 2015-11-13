/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.cdp;

/**
 *
 * @author 20122bsi0387
 */
public class AbstractPizzaOption extends Pizza {
    protected Pizza pizzaDecorator;

    public AbstractPizzaOption(Pizza pizza) {
        super(pizza.getPreco());
        this.pizzaDecorator = pizza;
    }
}
