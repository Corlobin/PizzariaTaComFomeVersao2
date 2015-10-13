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
public class QueijoGorgonzola extends Queijo {
    private static QueijoGorgonzola queijo;
    private QueijoGorgonzola(int quantidade) {
        super("Gorgonzola", quantidade);
    }
    public static synchronized QueijoGorgonzola getInstance(){
        if (queijo == null){
            queijo = new QueijoGorgonzola(1);
        }
        return queijo;                
    }

    
}
