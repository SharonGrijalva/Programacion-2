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
public class Ejercicio13 {
    
    Scanner s = new Scanner(System.in);
    
    public void ejercicio10()
    {
        int numero, positivo = 0, negativo = 0;
        
        do{
            System.out.println("Dame un numero positivo o negativo: ");
            numero = s.nextInt();
            if(numero < 0 )
            {
                negativo++;
            }else if(numero > 0 )
            {
                positivo++;
            }else
            {
                System.out.println("Opcion Incorrecta");
            }
        }while(numero <= 10);
        
        
        System.out.println("Los positivos son: )" + positivo + "Los negativos son: " + negativo);
    }
    
}
