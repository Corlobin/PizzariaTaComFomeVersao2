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
public class QueijoParmesao extends Queijo {

    private static QueijoParmesao queijo;
    private QueijoParmesao(int quantidade) {
        super("Parmesao", quantidade);
    }
    public static synchronized QueijoParmesao getInstance(){
        if (queijo == null){
            queijo = new QueijoParmesao(1);
        }
        return queijo;                
    }

}
