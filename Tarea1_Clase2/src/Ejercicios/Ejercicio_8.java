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
public class Ejercicio_8 {
    
    public int ejercicio8()
    {
        Scanner s = new Scanner(System.in);
        int horas, pago;
        System.out.println("Dime las horas laboradas en la semana: ");
        horas = s.nextInt();
        pago = horas * 12;
        return pago;
    }
    
}
