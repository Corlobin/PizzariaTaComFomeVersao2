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
public class MolhoTomate extends Molho {
    private static MolhoTomate molho;
    
    private MolhoTomate() {
        super("Molho de tomate", 1);
    }
    public static synchronized MolhoTomate getInstance(){
        if(molho == null)
            molho = new MolhoTomate();
        return molho;
    }
    @Override
    public String toString() {
        return "molho de tomate";
    }
    
}
