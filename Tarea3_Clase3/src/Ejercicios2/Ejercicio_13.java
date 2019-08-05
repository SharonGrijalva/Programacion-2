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
public class Ejercicio_13 {
    
    public int ejercicio13()
    {
        Scanner s = new Scanner(System.in);
        int uno, dos, tres, aux, resultado;
        System.out.println("Dame un numero: ");
        uno = s.nextInt();
        System.out.println("Dame un numero: ");
        dos = s.nextInt();
        System.out.println("Dame un numero: ");
        tres = s.nextInt();
        if(uno > dos)
        {
            aux = uno;
            uno = dos;
            dos = aux;
        }
        if(uno > tres)
        {
            aux = uno;
            uno = tres;
            tres = aux;
        }
        if(dos > tres)
        {
            aux = dos;
            dos = tres;
            tres = aux;
        }
        System.out.println(uno + " " + dos + " " + tres);
        return 0;
        
        
    }
    
}
