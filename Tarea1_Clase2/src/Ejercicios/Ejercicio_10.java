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
public class Ejercicio_10 {
    
    public void ejercicio10()
    {
        Scanner entrada = new Scanner(System.in);
        final double megabytes = 0.001;
        double kilobytes, conversion;
        System.out.println("Escriba la cantidad de KiloBytes: ");
        kilobytes = entrada.nextDouble();
        conversion = kilobytes * megabytes;
        System.out.println("MegaBytes: " + conversion);
    }
    
}
