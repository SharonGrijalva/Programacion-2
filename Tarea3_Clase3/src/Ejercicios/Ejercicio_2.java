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
public class Ejercicio_2 {
    
    public String ejercicio2 ()
    {
        Scanner s = new Scanner(System.in);
        int hora;
        String respuesta = "";
        System.out.println("Elige una opcion de hora");
        System.out.println("1.      6 - 12 hrs.");
        System.out.println("2.     13 - 20 hrs.");
        System.out.println("3.     21 - 5  hrs.");
        hora = s.nextInt();
        if(hora == 1)
        {
            respuesta = "Buenos Dias";
        }else if( hora == 2)
        {
            respuesta = "Buenas tardes";
        }else if( hora == 3)
        {
            respuesta = "Buenas Noches";
        }else
        {
            respuesta = "Respuesta Invalida,reinicia y elige entre la opcion 1, 2 o 3";
        }
        return respuesta;
    }
    
}
