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
public class Ejercicio1 {
    
    public void ejercicio1()
    {
         Scanner s = new Scanner(System.in);
         for(int i = 0; i>100; i++)
         {
             if(i % 5 == 0)
             {
                 System.out.println(i);
             }else
             {
                 System.out.println("No es multiplo");
             }
         }
    }
    
}
