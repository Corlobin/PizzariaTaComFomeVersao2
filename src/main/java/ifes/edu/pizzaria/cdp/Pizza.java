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
public class Pizza {
    private double valor;

    public Pizza() {
    }

    public Pizza(double valor) {
        this.valor = valor;
    }

    public double getPreco() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
