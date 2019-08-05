/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios3;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Ejercicio3 {
    Scanner s = new Scanner(System.in);
    public void ejercicio3()
    {
        int i = 0;
        
        
        do {
            if(i % 5 == 0)
             {
                 System.out.println(i + " Es Multiplo.");
             }else
             {
                 System.out.println(i + "No es multiplo");
             }
            i++;
         }while(i>100);
    }
        
}
