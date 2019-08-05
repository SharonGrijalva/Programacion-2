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
    
    public double ejercicio8 ()
    {
        Scanner s = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        System.out.println("Dame una nota: ");
        nota1 = s.nextFloat();
        System.out.println("Dame una nota: ");
        nota2 = s.nextFloat();
        System.out.println("Dame una nota: ");
        nota3 = s.nextFloat();
        media = (nota1 + nota2 + nota3)/3;
        if(media<60)
        {
            System.out.println("Promedio Insuficiente");
        }else if(media >=61 && media <=70)
        {
            System.out.println("Promedio Suficiente");
        }else if(media >=71 && media <=80)
        {
            System.out.println("Promedio Bueno");
        }else if(media >=81 && media <=90)
        {
            System.out.println("Promedio Notable");
        }else if(media >=91 && media <=100)
        {
            System.out.println("Promedio Sobresaliente");
        }
        return 0;
    }
    
}
