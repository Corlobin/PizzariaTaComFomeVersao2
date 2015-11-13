/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.*;

/**
 *
 * @author Ricardo
 */
public interface Fabrica {
    public Pizza criarMassa(Pizza pizza);
    public Pizza criarRecheio(Pizza pizza);
    public Pizza criarMolho(Pizza pizza);
    public Pizza criarPizza();
}
