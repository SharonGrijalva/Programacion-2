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
public class Ejercicio_11 {
    
    public int ejercicio11()
    {
        Scanner s = new Scanner(System.in);
        int horas, minutos, doce = 24, antesde;
        int segundos, segundoshoras =3600 , segundosminutos = 60;
        int segundoshoras2, segundosminutos2;
        System.out.println("Dime la hora (sin minutos)");
        horas = s.nextInt();
        System.out.println("Dime los minutos: ");
        minutos = s.nextInt();
        antesde = horas - doce;
        
        segundoshoras2 = antesde * segundoshoras;
        segundosminutos2 = minutos * segundosminutos;
        segundos = segundoshoras2 + segundosminutos2;
        System.out.println("Los segundos que faltan para la medianoche son: ");
        return segundos;
    }
    
}
