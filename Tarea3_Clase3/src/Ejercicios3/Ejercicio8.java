/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios3;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Ejercicio8 {
    
    public void ejercicio8()
    {
        Scanner s = new Scanner(System.in);
        int numero, contador = 0, multi, tabla = 0;
        System.out.println("Dame un numero");
        numero = s.nextInt();
        do{
            multi = numero * tabla;
            System.out.println(numero + " * " + multi);
            contador++;
            tabla++;
        }while(contador < 12);
    }
    
}
