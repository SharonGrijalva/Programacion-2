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
public class Ejercicio_5 {
   
    public void ejericio5()
    { 
        double area1, area2, resultado = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el area A y B separados por un espacio:");
        area1 = s.nextDouble();
        area2 = s.nextDouble();
        resultado = area1 * area2;
        System.out.println("El area del Rectangulo es: " + resultado);
    }
    
}
