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
public class Ejercicio_6 {
    
    public double ejercicio6()
    {
        double base, altura, resultado = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la base: ");
        base = s.nextDouble();
        System.out.println("Escribe la altura: ");
        altura = s.nextDouble();
        resultado = base * altura / 2;
        System.out.println("El area del Triangulo es: ");
        
        return resultado;
    }
    
}
