/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author Lili diaz
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op=new Scanner (System.in);
        ClPalindromo P = new ClPalindromo();
        
        String pal, b;
        System.out.println("Bienvenido Al programa");
        System.out.println("Ingrese la o las palabras a Evaluar");
        pal =op.nextLine();
        b= pal.replace(" ", "");
        boolean Frase = P.EsPalindromo(b.toCharArray(), 0, b.length());
        
        if(Frase){
            System.out.println("El texto ingresado si es palindromo");
        }else
            System.out.println("Esta palabra no es palindromo");
    }
    
}
