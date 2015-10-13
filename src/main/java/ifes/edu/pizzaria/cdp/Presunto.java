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
public class Presunto extends Ingrediente {
    private static Presunto presunto;
    private Presunto(int quantidade) {
        super("Presunto", quantidade);
    }
    public static synchronized Presunto getInstance(){
        if(presunto == null)
            presunto = new Presunto(1);
        return presunto;
    }
    @Override
    public String toString() {
        return "presunto";
    }
    
}
