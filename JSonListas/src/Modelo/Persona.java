package Modelo;

import java.io.Serializable;
/**
 *
 */
public class Persona implements Serializable{
   
    private String nombre;
    private String rango;
    private float sueldo;
    private String fecha;
    private int anios;
    private float TotalBono;
    private float total;
    private float porcentajeBono;

    public Persona(String nombre, String rango, float sueldo, int anios, float TotalBono, float total) {
        this.nombre = nombre;
        this.rango = rango;
        this.sueldo = sueldo;
        this.anios = anios;
        this.TotalBono = TotalBono;
        this.total = total;
    }

    

    public Persona(long id, String nombre, float sueldo, String fecha) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha = fecha;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public float getTotalBono() {
        return TotalBono;
    }

    public void setTotalBono(float TotalBono) {
        this.TotalBono = TotalBono;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getDesc() {
        return porcentajeBono;
    }

    public void setDesc(float desc) {
        this.porcentajeBono = desc;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return this.nombre.toUpperCase();
    }

    
}
