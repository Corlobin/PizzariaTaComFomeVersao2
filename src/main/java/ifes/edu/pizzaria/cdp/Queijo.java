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
public abstract class Queijo extends Ingrediente {

    public Queijo(String nome, int quantidade) {
        super(nome, quantidade);
    }
    @Override
    public String toString() {
        return "queijo " + nome;
    }
    
}
