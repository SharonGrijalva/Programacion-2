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
public class Ejercicio10 {
    Scanner s = new Scanner(System.in);
    
    public void ejercicio10()
    {
        int numero,contador = 0, media, suma = 0;
        do{
            System.out.println("Dame un numero positivo: ");
            numero = s.nextInt();
            contador++;
            suma=+ numero;
        }while(numero < 0);
        
        media = suma / contador;
        System.out.println("La media de los numeros = " + media);
    }
    
}
