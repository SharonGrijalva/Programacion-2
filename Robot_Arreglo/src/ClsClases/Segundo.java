/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsClases;

/**
 *
 * @author ekt
 */
public class Segundo {
    //variables privadas inicializadas
    private int robot_filas;
    private int robot_columnas;
    private int usuario_filas;
    private int usuario_columnas;
    //este metodo guarda las coordenadas del usuario
    public void usuario(int a, int b){
        usuario_filas = a;
        usuario_columnas = b;
    }
    //este metodo guarda las coordenadas del robot
    public void robot(int y, int z){
        robot_filas = y;
        robot_columnas = z;
    }
    //imprime las variables privadas del robot
    public int robot_y(){
        return robot_filas;
    }
    public int robot_z(){
        return robot_columnas;
    }
    //imprime las variables privadas del usuario
    public int usuario_a(){
        return usuario_filas;
    }
    public int usuario_b(){
        return usuario_columnas;
    }
     //este metodo imprime la matriz a usar
    public void despliega(int matriz[][]){
        for(int x = 0;  x < matriz.length; x++){
            for(int y = 0; y < matriz[x].length; y++){
                int currentCell = matriz[x][y];
                System.out.print(currentCell);
            }
            System.out.println();
            }
    }
    //este metodo se usa para obtener un numero aleatorio
    public int aleatorio(int numero){
      int tipo = (int)(Math.random() * numero); 
      return tipo;
    }
}
