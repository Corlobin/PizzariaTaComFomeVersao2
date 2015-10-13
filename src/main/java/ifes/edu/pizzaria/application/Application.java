/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.application;

import ifes.edu.pizzaria.cdp.Pizza;
import ifes.edu.pizzaria.util.FabricaPizza;

/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String args[]) {
        Pizza mussarela = FabricaPizza.criarPizza("Mussarela tradicional");
        System.out.println("Mussarela " + mussarela);
        Pizza presunto = FabricaPizza.criarPizza("Quatro queijos tradicional");
        System.out.println("Quatro queijos " + presunto);
        
    }
}
