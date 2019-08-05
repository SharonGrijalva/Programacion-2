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
public class Ejercicio_3 {
    
    public String ejercicio3()
    {
        Scanner s = new Scanner(System.in);
        String resultado = "";
        int dia;
        System.out.println("Dame un dia de la semana");
        dia = s.nextInt();
        if(dia == 1)
        {
            resultado = "Lunes";
        }else if( dia == 2)
        {
            resultado = "Martes";
        }else if( dia == 3)
        {
            resultado = "Miercoles";
        }else if( dia == 4)
        {
            resultado = "Jueves";
        }else if( dia == 5)
        {
            resultado = "Viernes";
        }else if ( dia == 6)
        {
            resultado = "Sabado";
        }else if( dia == 7)
        {
            resultado = "Domingo";
        }else 
        {
            resultado = "Opcion Invalida";
        }
        
        return resultado;
    }
    
}
