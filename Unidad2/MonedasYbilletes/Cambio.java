/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasybilletes;

/**
 *
 * @author Lili diaz
 */
public class Cambio {
    
    int mon1, mon2, mon5, mon10,bil20,bil50,bil100,bil200;

    
    public void Din (int Cambio){
    if (Cambio-200>=0){
      bil200=bil200+1;
      Din(Cambio-200);
    }
    else if (Cambio-100>=0){
      bil100=bil100+1;
      Din(Cambio-100);
    }
    else if (Cambio-50>=0){
      bil50=bil50+1;
      Din(Cambio-50);
    }
    else if (Cambio-20>=0){
      bil20=bil20+1;
      Din(Cambio-20);
    }
    else if (Cambio-10>=0){
      mon10=mon10+1;
      Din(Cambio-10);
    }
    else if (Cambio-5>=0){
      mon5=mon5+1;
      Din(Cambio-5);
    }
    else if (Cambio-2>=0){
      mon2=mon2+1;
      Din(Cambio-2);
    }
    else if (Cambio-1>=0){
      mon1=mon1+1;
      Din(Cambio-1);
    }
    
    
   
}
     public void ImpresiondeCambio(){
       System.out.println("Billete de 200: " + bil200);
        System.out.println("Billete de 100: " + bil100);
        System.out.println("Billete de 50: " + bil50);
        System.out.println("Billete de 20: "+ bil20);
        System.out.println("Moneda de 10: "+ mon10);
        System.out.println("Moneda de 5: " + mon5);
        System.out.println("Moneda de 2: "+ mon2);
        System.out.println("Moneda de 1: "+ mon1);
    }
}
