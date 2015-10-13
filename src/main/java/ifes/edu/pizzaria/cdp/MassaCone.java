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
public class MassaCone extends Massa {
    private static MassaCone massa;
    
    private MassaCone() {
        super("Cone");
    }
    public static synchronized MassaCone getInstance(){
        if(massa == null)
            massa = new MassaCone();
        return massa;
    }

    @Override
    public String toString() {
        return "cone";
    }
    
}
