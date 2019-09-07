/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



/**
 *
 * @author ekt
 */
public class mdAlumno {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the mediana
     */
    public double getMediana() {
        return mediana;
    }

    /**
     * @param mediana the mediana to set
     */
    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    /**
     * @return the moda
     */
    public double getModa() {
        return moda;
    }

    /**
     * @param moda the moda to set
     */
    public void setModa(double moda) {
        this.moda = moda;
    }

    /**
     * @return the rango
     */
    public double getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(double rango) {
        this.rango = rango;
    }

    /**
     * @return the desviacion
     */
    public double getDesviacion() {
        return desviacion;
    }

    /**
     * @param desviacion the desviacion to set
     */
    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    /**
     * @return the telegrama
     */
    public int getTelegrama() {
        return telegrama;
    }

    /**
     * @param telegrama the telegrama to set
     */
    public void setTelegrama(int telegrama) {
        this.telegrama = telegrama;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    private String nombre, correo;
    private double mediana, media, moda, rango, desviacion;
    private int telegrama, telefono;
    
    

}
