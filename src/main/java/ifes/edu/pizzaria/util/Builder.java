/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.Pizza;

/**
 *
 * @author Ricardo
 */
public interface Builder {
    public void prepararMassa();
    public void prepararRecheio();
    public void prepararMolho();
    public Pizza colocarForno();
    
}
