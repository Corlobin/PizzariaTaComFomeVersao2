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
public class QueijoMargherita extends Queijo {
    private static QueijoMargherita queijo;
    private QueijoMargherita(int quantidade) {
        super("Margherita", quantidade);
    }
    private synchronized static QueijoMargherita getInstance(){
        if (queijo == null){
            queijo = new QueijoMargherita(1);
        }
        return queijo;                
    }

    
}
