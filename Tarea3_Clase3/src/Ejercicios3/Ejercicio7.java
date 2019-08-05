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
public class Ejercicio7 {
    public void ejercicio7()
    {
        Scanner s = new Scanner(System.in);
        int password = 1234, contador = 3, contraseña;
       
        do{
            System.out.println("Acceso a Caja Fuerte");
            System.out.println("Dime la Contraseña:");
            contraseña = s.nextInt();
            if(contraseña == password)
            {
                System.out.println("La Caja Fuerte se ha abierto Satisfactoriamente");
            }else
            {
                System.out.println("Lo siento, esa no es la combinacion");
                System.out.println("Comodin: Son 4 digitos");
                System.out.println("Tienes Solamente " + contador + "intentos");
            }
        }while(contador == 0);
    }
    
}
