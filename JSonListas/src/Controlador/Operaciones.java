package Controlador;

import Modelo.Persona;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Operaciones implements Serializable {

    public static Operaciones general = null;

    static {
        iniciarDatos();
    }

    public static void iniciarDatos() {
        Operaciones tmpGeneral = SerializarObjeto.deserializarObjeto("EstadoProductos.dat", Operaciones.class);
        if (tmpGeneral == null) {
            System.out.println("Creando los Datos Iniciales");
            Operaciones.general = new Operaciones();
        } else {
            System.out.println("Cargando Datos del Archivo");
            Operaciones.general = tmpGeneral;
        }
    }

    private List<Persona> personas = new LinkedList<>();




    public void guardar() {
        SerializarObjeto.serializarObjeto("EstadoProductos.dat", this);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    public static int Fecha(String f){
         int fe;
        
            DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/MM/yyy");
            LocalDate fechaRegistro= LocalDate.parse(String.valueOf(f), date);
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaRegistro, fechaActual);
            fe = periodo.getYears();
            
        
        return fe;   
    }
    
    public static String rango(int a){
         String fe="";
         
        
        if (a < 5) {
                fe="Junior";
                
                
                
            }else{
                if (a<15) {
                 fe="Senior";

                    
                }else{
                    if (a>= 15) {
                     fe="Veterano";
  
                                       
                    }
                }
            }
            
        
        return fe;   
    }
    public static float Bono(String a,float sueldo){
         
         float bono = 0.00f;
         
        
        if (a == "Junior") {
                bono = sueldo*0.00f;
                
                
                
                
            }else{
                if (a == "Senior") {
                 bono = sueldo*0.10f;

                    
                }else{
                    if (a=="Veterano") {
                     bono = sueldo*0.20f;
  
                                       
                    }
                }
            }
            
        
        return bono;   
    }
    public static float Total(float TotalBono ,float sueldo){
         
         float total = 0.00f;
         
        
        total=TotalBono+sueldo;
            
        
        return total;   
    }
}


