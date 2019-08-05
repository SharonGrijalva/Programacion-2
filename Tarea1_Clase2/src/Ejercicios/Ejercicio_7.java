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
public class Ejercicio_7 {
    
    public double ejercicio7()
    {
        Scanner s = new Scanner(System.in);
        double totalsinimponible, totalimponible, iva= 1.12, finals, porcentaje;

        System.out.println("Escribe El total de la factura sin base imponible:");
        totalsinimponible = s.nextDouble();

        totalimponible = totalsinimponible/iva;
        porcentaje =( totalimponible*0.12);
        finals= totalsinimponible + porcentaje;

        System.out.println("El total de la factura es: ");
        
        return finals;
    }
    
}
