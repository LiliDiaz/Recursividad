/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deci.binario;

/**
 *
 * @author Lili diaz
 */
public class Binario {
    
    public void SiesBinario (int n){
    if (n<2){
        System.out.print(n);
    }else{
       SiesBinario(n/2);
        System.out.print(n%2);
    }
    }
}
