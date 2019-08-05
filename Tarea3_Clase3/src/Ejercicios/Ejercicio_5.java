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
    
    public int ejercicio5()
    {
        Scanner entrada = new Scanner(System.in);
        float x,a, e;
        System.out.println("Coeficiente de x: ");
        x = entrada.nextInt();
        System.out.println("Termino Independiente: ");
        a= entrada.nextInt();
        if(a==0)
        {
        System.out.println("No es una Ecuacion");
        }
        else
        {
         e=-a/x;
         System.out.println("La Respuesta es: " + e);
        }
        System.out.println("Fin");
        return 0;
    }
    
}
