/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.pizzaria.util;

/**
 *
 * @author 20122BSI0387
 */
public class BridgePizzaQuatroQueijos extends BridgePizza{

    public BridgePizzaQuatroQueijos(Builder builder) {
        super(builder);
    }
    public void dobroRecheio(){
        fazerRecheio();
        fazerRecheio();
    }
}