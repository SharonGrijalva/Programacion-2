/*2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot2;

import ClsClases.Primero;

/**
 *
 * @author ekt
 */
public class Robot2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llama a la clase primero 
        Primero juego = new Primero();
        //Llama al juego
        System.out.println("Quieres Jugar?");
        System.out.println("El juego consiste en que TU eres el Numero 1");
        System.out.println("Tienes que apoyarte con los botones para llegar al numero 2");
        System.out.println();
        //se llama al juego
        juego.iniciar_juego();
    }
    
}
