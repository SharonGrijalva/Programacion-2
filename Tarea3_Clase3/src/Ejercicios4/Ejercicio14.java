/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios4;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Ejercicio14 {
    Scanner s = new Scanner(System.in);
    
    public void ejercicio10()
    {
        int base, exponente, resultado;
        
        System.out.println("Dame una base: ");
        base = s.nextInt();
        System.out.println("Dame un Exponente");
        exponente = s.nextInt();
        
        for(int i= 2 ; i < exponente; i++)
        {
            resultado = base * base;
        }
    }
    
}
