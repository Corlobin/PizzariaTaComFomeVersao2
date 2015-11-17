/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.pizzaria.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20122bsi0387
 */
public class PizzaFlyweightFactory {
    private Map<String, Builder> mussarela;
    private Map<String, Builder> quatroQueijos;

    public PizzaFlyweightFactory() {
        mussarela = new HashMap<String, Builder>();
        quatroQueijos = new HashMap<String, Builder>();        
    }
    public Builder getMussarela(String tipo){
        Builder b = mussarela.get(tipo);
        if(b == null){
            if(tipo.equals("tradicional")) {
                b = new FabricaPizzaMussarelaBuilder();
            } else {
                b = new FabricaPizzaMussarelaConeBuilder();
            }
        } 
        return b;            
    }
    public Builder getQuatroQueijos(String tipo){
        Builder b = mussarela.get(tipo);
        if(b == null){
            if(tipo.equals("tradicional")) {
                b = new FabricaPizzaQuatroQueijosBuilder();
            } else {
                b = new FabricaPizzaQuatroQueijosConeBuilder();
            }
        } 
        return b;            
    }
    
    public Builder getBuilder(String tipo) {
        Builder builder = null;
        if(tipo.equals("Mussarela tradicional"))
            builder = getMussarela("tradicional");
        else if(tipo.equals("Mussarela cone"))
            builder = getMussarela("cone");
        else if (tipo.equals("Quatro queijos tradicional"))
            builder = getQuatroQueijos("tradicional");
        else if(tipo.equals("Quatro queijos cone"))
            builder = getQuatroQueijos("cone");
        
        return builder;
    }
    
    
}
