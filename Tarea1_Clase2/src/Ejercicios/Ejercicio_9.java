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
public class Ejercicio_9 {
    
    public void ejercicio9()
    {
        final double pi=3.1416;
        double radio, altura, volumen;
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el radio del cono: ");
        radio = s.nextDouble();
        System.out.println("Escribe la altura del cono: ");
        altura = s.nextDouble();
        volumen= ((pi * (radio * radio)) * altura)/3;

        System.out.println("El volumen del cono es: " + volumen);
    }
    
}
