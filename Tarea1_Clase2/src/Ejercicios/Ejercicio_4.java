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
    
    public int ejericio4()
    {
        
        Scanner s = new Scanner(System.in);
        int numero1, numero2, resultadosuma, resultadoresta, resultadomulti, resultadodivision;
        System.out.println("Dame un numero: ");
        numero1 = s.nextInt();
        System.out.println("Dame un numero: ");
        numero2 = s.nextInt();
        resultadosuma = numero1 + numero2;
        resultadoresta = numero1 - numero2;
        resultadomulti = numero1 * numero2;
        resultadodivision = numero1 / numero2;
        return resultadosuma + resultadoresta + resultadomulti + resultadodivision;
    }
    
}
