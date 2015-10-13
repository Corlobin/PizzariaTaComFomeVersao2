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
public class MassaTradicional extends Massa {

    private static MassaTradicional massa;
    
    private MassaTradicional() {
        super("Tradicional");
    }
    public static synchronized MassaTradicional getInstance(){
        if(massa == null)
            massa = new MassaTradicional();
        return massa;
    }
    @Override
    public String toString() {
        return "tradicional";
    }

}
