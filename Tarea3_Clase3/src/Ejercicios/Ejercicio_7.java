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
    
    public double ejercicio7 ()
    {
        Scanner s = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        System.out.println("Dame una nota: ");
        nota1 = s.nextFloat();
        System.out.println("Dame una nota: ");
        nota2 = s.nextFloat();
        System.out.println("Dame una nota: ");
        nota3 = s.nextFloat();
        media = (nota1 + nota2 + nota3)/3;
        return media;
    }
    
}
