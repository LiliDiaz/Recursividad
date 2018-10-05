/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deci.binario;

import java.util.Scanner;

/**
 *
 * @author Lili diaz
 */
public class DeciBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        Binario b= new Binario ();
        
        int num;
        
        System.out.println("El Numero decimal: ");
        num= teclado.nextInt();
        System.out.println("en Binario es: ");
        b.SiesBinario(num);
        
    }
    
}
