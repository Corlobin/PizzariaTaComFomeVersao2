/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.cdp;

/**
 *
 * @author Ricardo
 */
public class PizzaMassaCone extends AbstractPizzaOption {
     public PizzaMassaCone(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getPreco() {
        return pizzaDecorator.getPreco() + 10.00;               
    }
    
}
