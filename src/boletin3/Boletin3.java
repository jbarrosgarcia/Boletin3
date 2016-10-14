/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author Jose Barros
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo cons1=new Consumo();
        cons1.setLitros(50);
        cons1.setpGas(1.57f);
        Consumo cons2=new Consumo(250f,55f,110.5f,1.67f);
    }
    
}
