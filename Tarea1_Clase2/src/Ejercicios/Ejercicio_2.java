/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Ejercicio_2 {
    
    public void ejercicio2(){
        
        Scanner s = new Scanner(System.in);
        final double euro = 0.0060;
        double pesetas, conversion;
        System.out.println("Escriba la cantidad de pesetas: ");
        pesetas = s.nextDouble();
        conversion = pesetas * euro;
        System.out.println("Euros: " + conversion);
        
    }
    
}
