
import ifes.edu.pizzaria.cdp.*;
import ifes.edu.pizzaria.util.FabricaPizza;
import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class TestePizzaria extends TestCase
{
    
    public void testCebola(){
        Pizza pizza = new Pizza();
        pizza = new PizzaCebola(pizza);
        assertEquals(pizza.getPreco(), 3.0);        
    }
    public void testMassaCone() {
        Pizza pizza = new Pizza();
        pizza = new PizzaMassaCone(pizza);
        assertEquals(pizza.getPreco(), 10.0);    
    }
    public void testMassaTradicional(){ 
        Pizza pizza = new Pizza();
        pizza = new PizzaMassaTradicional(pizza);
        assertEquals(pizza.getPreco(), 5.0);
    }
    public void testMolhoTomate(){
        Pizza pizza = new Pizza();
        pizza = new PizzaMolhoTomate(pizza);
        assertEquals(pizza.getPreco(), 3.0);       
    }
    public void testPresunto(){
        Pizza pizza = new Pizza();
        pizza = new PizzaPresunto(pizza);
        assertEquals(pizza.getPreco(), 3.0);    
    }
    
    public void testGorgonzola() {
        Pizza pizza = new Pizza();
        pizza = new PizzaQueijoGorgonzola(pizza);
        assertEquals(pizza.getPreco(), 1.0);    
    }
    public void testMargherita(){
        Pizza pizza = new Pizza();
        pizza = new PizzaQueijoMargherita(pizza);
        assertEquals(pizza.getPreco(), 1.0);
    }
    public void testMussarela(){
        Pizza pizza = new Pizza();
        pizza = new PizzaQueijoMussarela(pizza);
        assertEquals(pizza.getPreco(), 1.0);
    }
    public void testParmesao() {
        Pizza pizza = new Pizza();
        pizza = new PizzaQueijoParmesao(pizza);
        assertEquals(pizza.getPreco(), 1.0);
    }
    public void testProvolone() {
        Pizza pizza = new Pizza();
        pizza = new PizzaQueijoProvolone(pizza);
        assertEquals(pizza.getPreco(), 1.0);    
    }
    
    /**
     * Primeiro eu faço o teste falhar para depois consertar.
     * Irei testar primeiro se a criarPizza esta retornando 0.
     * Depois testo se está retornando o preço dela normal.
     */
    public void testMussarelaTradicional()
    {
        /*
        * 
        *
        */
        Pizza mussarela = FabricaPizza.criarPizza("Mussarela tradicional");
        assertEquals(mussarela.getPreco(), 16.0);
    }
    
    public void testQuatroQueijosTradicional()
    {
        /*
        * 
        *
        */
        Pizza queijos4 = FabricaPizza.criarPizza("Quatro queijos tradicional");
        assertEquals(queijos4.getPreco(), 19.0);
    }
}
