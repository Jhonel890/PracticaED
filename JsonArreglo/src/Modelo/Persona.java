/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.View;
import Controlador.Contar;
import static Vista.View.txtNombre;
import static Vista.View.txtSueldo;
import static Vista.View.txtFecha;
import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Persona implements Serializable{

    private String nombre;
    private float sueldo;
    private String fecha;
    private int anios;
    private float totalBono;
    private float total;
    private float desc;
    

    private String rango;

    public Persona() {
        nombre = "";
        sueldo = 0;
        fecha = "";
        totalBono = 0;
        total = 0;
        rango = "";
    }

    public Persona(String nombre, float sueldo, String fecha) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha = fecha;
    }

    public Persona(float descuento, float total, String rango) {
        this.totalBono = descuento;
        this.total = total;
        this.rango = rango;
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


    public float getDescuento() {
        return totalBono;
    }

    public void setDescuento(float descuento) {
        this.totalBono = descuento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public float getTotalBono() {
        return totalBono;
    }

    public void setTotalBono(float TotalBono) {
        this.totalBono = TotalBono;
    }

    public float getDesc() {
        return desc;
    }

    public void setDesc(float desc) {
        this.desc = desc;
    }

    public Persona Llenar() {
        float x = Float.parseFloat(View.txtSueldo.getText());
        
        nombre = String.valueOf(View.txtNombre.getText());
        sueldo = x;
        fecha = String.valueOf(View.txtFecha.getText());
        Persona m = new Persona(nombre, sueldo, fecha);

        return m;
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

    @Override
    public String toString() {
        return "|" + "Nombre: " + nombre + " | Sueldo: " + sueldo + " |  Anios: " + fecha + " |" + "Descuento  " + totalBono + "Total  " + total;
    }

}
