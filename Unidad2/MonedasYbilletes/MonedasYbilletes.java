/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasybilletes;

import java.util.Scanner;

/**
 *
 * @author Lili diaz
 */
public class MonedasYbilletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        int TotC, Pago;
        Cambio c=new Cambio();
        System.out.println("¿Cuanto es el total de la compra?");
        TotC=teclado.nextInt();
        System.out.println("¿Cuando dinero se Recibe?");
        Pago=teclado.nextInt();
        
        c.Din(Pago-TotC);
        c.ImpresiondeCambio();
        
    }
    
}
