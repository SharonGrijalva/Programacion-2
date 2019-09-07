/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsClases;

import java.io.BufferedReader;  
import java.io.FileReader;

/**
 *
 * @author ekt
 */
public class Dos {
    //vector inicial
    String[] arreglos;
    int[]vector;
    //variable a usar
    double media, mediana, moda, rango, desviacion;
    //burbuja...
    public int[] burbuja(int ord){
        int i, j , aux = 0;
        int n = vector.length;
        for(i = 1; i < n-1; i++){
            for(j = i + 1; j<n; j++){
                if(ord==0){
                    if(vector[i] > vector[j]){
                        aux = vector[j];
                        vector[j]= vector[i];
                        vector[i]= aux;
                    }
                }else if(ord==1){
                    if(vector[i]< vector[j]){
                        aux= vector[i];
                        vector[i]= vector[j];
                        vector[j]= aux;
                    }
                }//if ord=1
            }//if ord=0
        }
        return vector;
    }
    //media
     public double media(){
        double prom = 0.0;
        for(int i = 0; i< vector.length; i++){
            prom+= vector[i];
        }
        return prom/ (double) vector.length;
    }
     //mediana
     public double mediana(){
         int pos=0, n= vector.length;
         double temp =0, temp0 =0;
         //ordenar de menor a mayor
         vector = burbuja(0);
         temp=n/2;
         if(n%2 ==0){
             pos = (int)temp;
             temp0 = (double)(vector[pos]/vector[pos+1]);
         }
         if(n%2==1){
             pos= (int)(temp + 0.5);
             temp0= (double)(vector [pos]);
         }
         return temp0;
     }
     //desviacion
     public double desviacion(){
         double prom, sum = 0; int i, n = vector.length;
         prom = media();
         
         for(i = 0; i < n; i++){
             sum+= Math.pow(vector[i] - prom, 2);
         }
         return Math.sqrt(sum/ (double)n);
     }
     //rango
    public int rango(){
         //ordenar de mayor a menor
         vector = burbuja(1);
         return vector[vector.length-1]-vector[0];
     }
    //moda
    public int moda(){
         int i, j, moda =0, n= vector.length, frech;
         int frecTemp, frecModa = 0, moda1 = -1;
         //ordenar de menor a mayor
         vector = burbuja(0);
         for(i= 0; i < n; i++){
             frecTemp= 1;
             for(j=i + 1; j < n; j++){
                 if(vector[i] ==  vector[j]){
                     frecTemp++;
                 }
             }
                 if(frecTemp > frecModa){
                     frecModa = frecTemp;
                     moda1 = vector[i];
                 }
             }
         return moda1;
     }
    //reporta vector
    public void reportaVector(){
         for(int i = 0; i < vector.length; i++ ){
             System.out.print(vector[i] + " ");
         }
         System.out.println("");
     }
    
    
    public void lectura_datos(){
        String csvFile = "C:\\Users\\ekt\\Documents\\Datos\\Seccion A,Datos.csv";
        BufferedReader br = null;
        String line = "" ;
        String cvsSplitBy = ";";
        int dato = 11;
        
        try{
            br =  new BufferedReader(new FileReader(csvFile));
            while((line = br.readLine()) != null){
                
                String[] datos = line.split(cvsSplitBy);
                System.out.println(datos[0] + "\n" + datos[1] + "," + datos[2] + "," + datos[3] + "," + datos[4] + "," + datos[5]+ "," + datos[6] + "," + datos[7] + "," + datos[8]+ "," + datos[9] + "," + datos[10]);
                System.out.println("");
                //procedimiento vario
                vector = new int [10];
                arreglos = new String [1];
                arreglos[0] = datos[0];
                //string a int
                for(int j = 1; j<10 ; j++){
                    vector[j] = Integer.parseInt(datos[j]);
                }
                //llamar a los resultados
                media = media();
                mediana = mediana();
                moda = moda();
                rango = rango();
                desviacion = desviacion();
                System.out.println("Media del vector: " + media);
                System.out.println("Mediana del vector: " + mediana);
                System.out.println("Moda del vector: " + moda);
                System.out.println("Rango del vector: " + rango);
                System.out.println("Desviacion del vector: " + desviacion);
                System.out.println("\n\n");
                
            }
        }catch(Exception e){
             System.out.println("Fallo de Sistema");
         }
        
    }

}
