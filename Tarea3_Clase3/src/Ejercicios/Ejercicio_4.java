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
public class Ejercicio_4 {
    
    public int ejercicio4()
    {
        Scanner s = new Scanner(System.in);
        int horas, pago;
        System.out.println("Dime las horas laboradas en la semana: ");
        horas = s.nextInt();
        if(horas <=40)
        {
            pago = horas *12;
            return pago;
        }else if(horas >= 41)
        {
           int horasordinarias = 40, horasextras ,pagoextra , pagototal;
           horasextras = horasordinarias - horas;
           
           pago = horasordinarias*12;
           pagoextra = horasextras * 16;
           pagototal = pago + pagoextra;
           return pago;
        }else 
        {
            System.out.println("Opcion Invalida");
        }
        
        return 0;
    }
    
}
