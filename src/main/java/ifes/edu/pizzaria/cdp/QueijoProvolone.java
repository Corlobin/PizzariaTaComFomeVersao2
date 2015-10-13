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
public class QueijoProvolone extends Queijo {

    private static QueijoProvolone queijo;
    private QueijoProvolone(int quantidade) {
        super("Provolone", quantidade);
    }
    private synchronized static QueijoProvolone getInstance(){
        if (queijo == null){
            queijo = new QueijoProvolone(1);
        }
        return queijo;                
    }
    
}
