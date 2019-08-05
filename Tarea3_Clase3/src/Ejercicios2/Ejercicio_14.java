/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios2;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Ejercicio_14 {
    
    public int ejercicio14()
    {
        Scanner s = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero entero: ");
        numero = s.nextInt();
        if(numero % 2 == 0)
        {
            System.out.println("El numero es par");
            if(numero % 5 == 0)
            {
                System.out.println("El numero es divisible entre 5");
            }else
            {
                System.out.println("El numero no es divisible entre 5");
            }
        }else
        {
            System.out.println("El numero es impar");
        }
        return 0;
    }
    
}
