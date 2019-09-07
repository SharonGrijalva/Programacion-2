/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada_Salida;

import Modelo.mdAlumno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ekt
 */
public class ClsArchivo {
    
//    String[] dts0;
//    int[] arr0;
    
    public List<mdAlumno> leer(){
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;   
        List<mdAlumno> arregloAlumno = new ArrayList<mdAlumno>();  //(array list organizado
        
        try{
            archivo = new File ("C:\\Users\\ekt\\Documents\\Datos\\Seccion A,Datos.csv");
            double mediana, media, moda, rango, desviacion;
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            ClsEstadistica calcula;
            String linea;
            
            while((linea = br.readLine())!=null){
                String[] dts = linea.split(";");
                int[] arr = new int[dts.length];

                for(int i = 2 ; i < 12; i++) {
                    try {
                       arr[i] = Integer.parseInt(dts[i]);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Fallo de Sistema");
                    }          
                }
                calcula = new ClsEstadistica(arr);
                //calculo de estadisticas
                mediana = calcula.mediana();
                desviacion = calcula.desviacion();
                moda = calcula.moda();
                rango = calcula.rango();
                media = calcula.promedio();
                //guardar datos
                mdAlumno alumno = new mdAlumno();
                arregloAlumno.add(alumno);
                alumno.setNombre(dts[0]);
                alumno.setCorreo(dts[1]);
                alumno.setMedia(media);
                alumno.setMediana(mediana);
                alumno.setModa(moda);
                alumno.setRango(rango);
                alumno.setDesviacion(desviacion);
                alumno.setTelefono(arr[12]);
                alumno.setTelegrama(arr[13]);
            }
        }
        catch(IOException e){
            System.out.println("Fallos de Sistema");
        }finally{
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (IOException e2){ 
                System.out.println("Fallos de Systema");
            }
        }return arregloAlumno;
    }
}
