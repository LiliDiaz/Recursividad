/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author Lili diaz
 */
public class ClPalindromo {
    
    public boolean EsPalindromo(char [] palChars, int a, int b){
    
        
        if (a==b || a==b-1){
        return true;
        }else{
        return palChars[a] == palChars [b-1] && EsPalindromo(palChars, a+1,b-1);
        }
    }
}
