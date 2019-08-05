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
    
    public String ejercicio1()
    {
        Scanner s = new Scanner(System.in);
        String dia, resultado = "";
        System.out.println("Dame un dia de la semana");
        dia = s.next();
        if(dia == "lunes")
        {
            resultado = "Programacion 2";
        }else if( dia == "martes")
        {
            resultado = "Fisica 2";
        }else if( dia == "miercoles")
        {
            resultado = "Microeconomia";
        }else if( dia == "jueves")
        {
            resultado = "Sin Asignatura";
        }else if( dia == "viernes")
        {
            resultado = " Estadistica 1";
        }else if ( dia == "sabado")
        {
            resultado = "Sin Asignatura";
        }else if( dia == "domingo")
        {
            resultado = "Sin Asignatura";
        }else 
        {
            resultado = "Opcion Invalida";
        }
        
        return resultado;
    }
    
}
