/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import Entrada_Salida.ClsArchivo;
import Modelo.mdAlumno;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author ekt
 */
public class Proyecto_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        List<mdAlumno> a1 =  new ClsArchivo().leer();
        int a;
        String tecla = null;
        ClsArchivo juego = new ClsArchivo();
        
        do{
            System.out.println("MENU");
            System.out.println("1.  Media");
            System.out.println("2.  Mediana");
            System.out.println("3.  Moda");
            System.out.println("4.  Rango");
            System.out.println("5.  Desviacion");
            System.out.println("6.  Salir");
            a = entrada.nextInt();
            if(a == 1){
                a1.forEach((d)-> System.out.println(d.getNombre()+" Promedio: "+ d.getMedia()+"\n")); 
            }else if( a == 2){
                a1.forEach((d)-> System.out.println(d.getNombre()+" Mediana: "+ d.getMediana()+"\n")); 
            }else if( a == 3){
                a1.forEach((d)-> System.out.println(d.getNombre()+" Moda: "+ d.getModa()+"\n")); 
            }else if( a == 4){
                a1.forEach((d)-> System.out.println(d.getNombre()+" Rango: "+ d.getRango()+"\n")); 
            }else if( a == 5){
                a1.forEach((d)-> System.out.println(d.getNombre()+" Desviacion: "+ d.getDesviacion()+"\n")); 
            }else if( a == 6){
                System.out.println("Fin");
            }else{
                System.out.println("Error De Sistema");
            }
            System.out.println("\nRepetir?");
            System.out.println(" Si     No");
            tecla = new Scanner(System.in).nextLine();
            System.out.println("\n");       
        }while(tecla.equals("si")|| tecla.equals("Si"));
    }
    
}
