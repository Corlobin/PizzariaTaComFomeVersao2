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
public class PizzaMolhoTomate extends AbstractPizzaOption {
    public PizzaMolhoTomate(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getPreco() {
        return pizzaDecorator.getPreco() + 3.00;               
    }
    
}
