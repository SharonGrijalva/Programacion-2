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
public class Ejercicio_3 {
    
    public void ejercicio3(){
        
        Scanner s = new Scanner(System.in);
        final double pesetas = 0.01;
        double euros, conversion;
        System.out.println("Escriba la cantidad de euros: ");
        euros = s.nextDouble();
        conversion = pesetas * euros;
        System.out.println("Pesetas: " + conversion);
    }
    
}
