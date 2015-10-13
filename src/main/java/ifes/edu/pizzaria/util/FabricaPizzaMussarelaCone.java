/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import ifes.edu.pizzaria.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class FabricaPizzaMussarelaCone implements Fabrica {

@Override
    public Massa criarMassa() {
        MassaCone massa = MassaCone.getInstance();
        return massa;               
    }

    @Override
    public Recheio criarRecheio() {
        QueijoMussarela mussarela = QueijoMussarela.getInstance();
        QueijoGorgonzola gorgonzola= QueijoGorgonzola.getInstance();
        Presunto presunto = Presunto.getInstance();
        Cebola cebola = Cebola.getInstance();
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(mussarela);
        ingredientes.add(gorgonzola);
        ingredientes.add(cebola);
        ingredientes.add(presunto);
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
