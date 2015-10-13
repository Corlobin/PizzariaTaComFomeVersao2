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
public class Cebola extends Ingrediente {
    private static Cebola cebola;
    
    private Cebola(int quantidade) {
        super("Cebola", quantidade);
    }
    public static synchronized Cebola getInstance(){
        if (cebola == null){
            cebola = new Cebola(1);
        }
        return cebola;                
    }

    @Override
    public String toString() {
        return "Cebola";
    }
    
}
