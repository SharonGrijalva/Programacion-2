/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsClases;

import java.util.Scanner;

/**
 *
 * @author ekt
 */
public class Primero {
    //Variables a usar 
    Scanner entrada = new Scanner(System.in);
    //llama a la clase segundo
    Segundo usuario = new Segundo(); 
    //inicializamos matriz
    int matriz [][]= new int[10][10];
    //esta variable posee el tamaño de la matriz
    int numero_aleatorio = matriz.length;
    //estas variables tienen numeros aleatorios c/u
    int y = usuario.aleatorio(numero_aleatorio);
    int z = usuario.aleatorio(numero_aleatorio);
    int a = usuario.aleatorio(numero_aleatorio);
    int b = usuario.aleatorio(numero_aleatorio);
    //variables contadoras de pasos
    int arriba = 0, abajo = 0, derecha = 0, izquierda = 0;
    //este metodo desplegara una matriz con dos numeros en rango aleatorio
    public void juego_robot(){
        for(int x = 0; x < matriz.length; x++){
            matriz[y][z]= 2;//robot
            matriz[a][b]= 1;//usuario
        }        
        usuario.despliega(matriz);
        usuario.robot(y, z);
        usuario.usuario(a, b);
    }
    //este metodo hara que se pueda jugar dentro de la matriz    
    public void operacion(){
        int menu;
        System.out.println();
        System.out.println("Elige una opcion: ");
        System.out.println("1. Subir");
        System.out.println("2. Bajar");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        System.out.println("5. Salir ");
        menu = entrada.nextInt();
        //menu para jugar en la matriz
        if(menu == 1){
            //sube
            a--;
            System.out.println();
            for(int x = 0; x < matriz.length; x++){
                matriz[y][z]= 2;//robot
                matriz[a][b]= 1;//usuario
            }        
            usuario.despliega(matriz);
            usuario.robot(y, z);
            usuario.usuario(a, b);
            arriba++;
        }else if(menu == 2){
            //baja
            a++;
            System.out.println();
            for(int x = 0; x < matriz.length; x++){
                matriz[y][z]= 2;//robot
                matriz[a][b]= 1;//usuario
            }        
            usuario.despliega(matriz);
            usuario.robot(y, z);
            usuario.usuario(a, b);
            abajo++;
        }else if(menu == 3){
            //izquierda
            b--;
            System.out.println();
            for(int x = 0; x < matriz.length; x++){
                matriz[y][z]= 2;//robot
                matriz[a][b]= 1;//usuario
            }        
            usuario.despliega(matriz);
            usuario.robot(y, z);
            usuario.usuario(a, b);
            izquierda++;
        }else if(menu == 4){
            //derecha
            b++;
            System.out.println();
            for(int x = 0; x < matriz.length; x++){
                matriz[y][z]= 2;//robot
                matriz[a][b]= 1;//usuario
            }        
            usuario.despliega(matriz);
            usuario.robot(y, z);
            usuario.usuario(a, b);
            derecha++;
         }else if(menu == 5){
             System.out.println("Fin del Juego");
         }else{
             System.out.println("Opcion Incorrecta");
         }
    }
    public void iniciar_juego(){
        int numeros =  matriz[y][z] + matriz[a][b]; 
        int contador;
        //llama al metodo inicial
        juego_robot();
        //llama al juego
        System.out.println();
        do{
            System.out.println("Recuerda que debes de dar un paso mas para ganar");
            if((numeros <= 10)){
                 numeros = matriz[y][z] + matriz[a][b];  
                 operacion();
                 System.out.println();
            }
        }while((numeros == 3));
        contador = arriba + abajo + izquierda +  derecha;
        System.out.println("LLEGASTE ");
        System.out.println("Utilizaste " + contador + " Pasos para llegar\n");
        System.out.println("\tPasos hacia arriba " + arriba);
        System.out.println("\tPasos hacia abajo " + abajo);
        System.out.println("\tPasos hacia la izquierda " + izquierda);
        System.out.println("\tPasos hacia la derecha " + derecha);
       
    }
}