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
public class QueijoMussarela extends Queijo {
    private static QueijoMussarela queijo;
    private QueijoMussarela(int quantidade) {
        super("Provolone", quantidade);
    }
    public static synchronized QueijoMussarela getInstance(){
        if (queijo == null){
            queijo = new QueijoMussarela(1);
        }
        return queijo;                
    }

    
}
