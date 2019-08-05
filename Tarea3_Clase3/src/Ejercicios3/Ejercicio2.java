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
public class Ejercicio2 {
    
    public void ejercicio2()
    {
        int i = 0;
        
        while(i>100)
        {
             if(i % 5 == 0)
             {
                 System.out.println(i + " Es Multiplo.");
             }else
             {
                 System.out.println(i + "No es multiplo");
             }
             i++;
        }
    }
    
}
