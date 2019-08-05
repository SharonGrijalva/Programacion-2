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
public class Ejercicio_1 {
    
    
    public int Ejercicio1()
    {
        Scanner s = new Scanner(System.in);
        int numero1 , numero2, resultado;
        System.out.println("Dame un numero: ");
        numero1 = s.nextInt();
        System.out.println("Dame un numero: ");
        numero2 = s.nextInt();
        resultado = numero1 * numero2;
        return resultado;
    }
   
    
}
