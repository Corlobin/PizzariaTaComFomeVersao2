/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.Cebola;
import ifes.edu.pizzaria.cdp.Ingrediente;
import ifes.edu.pizzaria.cdp.Massa;
import ifes.edu.pizzaria.cdp.MassaTradicional;
import ifes.edu.pizzaria.cdp.Molho;
import ifes.edu.pizzaria.cdp.MolhoTomate;
import ifes.edu.pizzaria.cdp.Pizza;
import ifes.edu.pizzaria.cdp.Presunto;
import ifes.edu.pizzaria.cdp.QueijoGorgonzola;
import ifes.edu.pizzaria.cdp.QueijoMussarela;
import ifes.edu.pizzaria.cdp.QueijoParmesao;
import ifes.edu.pizzaria.cdp.Recheio;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class FabricaPizzaQuatroQueijos implements Fabrica {

    @Override
    public Massa criarMassa() {
        Massa massa = MassaTradicional.getInstance();
        return massa;
    }

    @Override
    public Recheio criarRecheio() {
        QueijoParmesao queijo1 = QueijoParmesao.getInstance();
        QueijoMussarela queijo2 = QueijoMussarela.getInstance();
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(queijo1);
        ingredientes.add(queijo2);
        return new Recheio(ingredientes);        
    }

    @Override
    public Molho criarMolho() {
        Molho molho = MolhoTomate.getInstance();
        return molho;
    }

    @Override
    public Pizza criarPizza() {
        return new Pizza();
    }
    
}
