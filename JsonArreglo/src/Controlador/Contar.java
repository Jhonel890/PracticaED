
package Controlador;

import static Controlador.Contar.arreglo;
import Modelo.Persona;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Contar {
    Gson gson = new Gson();
    public static Persona arreglo [];

    private int posUltimo;
    private int tamanio;


    public Contar(int tam) {
       //int tam= String.valueOf(JOptionPane.showInputDialog("Ingresar la cantidad de datos que desea ingresar"));
       tamanio=tam;
       posUltimo=0;
       arreglo=new Persona[tamanio];
    }
    
    
    
    public void Ingresar(){
      
        if(posUltimo<tamanio){
            Persona ob =new Persona();
            ob =ob.Llenar();
            arreglo[posUltimo] = ob;
            posUltimo++;
            
            
        }else{
                    JOptionPane.showMessageDialog(null,"Array lleno");
                    

        }
    }
    
    
    
    

    
    public static void ver(){
        
        
        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i].getAnios() < 5) {
                System.out.println("Junior       "+arreglo[i].getSueldo());
                arreglo[i].setDescuento(0.00f);
                arreglo[i].setRango("Junior");
                arreglo[i].setDesc(00f);
                arreglo[i].setTotal(arreglo[i].getSueldo());
                
                
            }else{
                if (arreglo[i].getAnios()<15) {
                    arreglo[i].setTotal(arreglo[i].getSueldo()+ arreglo[i].getSueldo() * 0.10f);
                    System.out.println("Senior       "+arreglo[i].getTotal());
                    arreglo[i].setDescuento(arreglo[i].getSueldo()*0.10f);
                    arreglo[i].setRango("Senior");
                    arreglo[i].setDesc(10f);
                    
                }else{
                    if (arreglo[i].getAnios()>= 15) {
                        arreglo[i].setTotal(arreglo[i].getSueldo()+ arreglo[i].getSueldo() * 0.20f);
                        System.out.println("Veterano    "+arreglo[i].getTotal());
                        arreglo[i].setDescuento(arreglo[i].getSueldo()*0.20f);
                        arreglo[i].setRango("Veterano");
                        arreglo[i].setDesc(20f);
                                       
                    }
                }
            }
        }
        
        
    }
    
    public static void fechaAnios(String fecha){
        for (int i = 0; i < arreglo.length; i++) {
            DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/MM/yyy");
            LocalDate fechaNacimiento = LocalDate.parse(String.valueOf(arreglo[i].getFecha()), date);
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, fechaActual);
            //System.out.println(periodo.getYears());
            arreglo[i].setAnios(periodo.getYears());
        }    
    }
       
}


   
   
   
   
   
   
   
    
    
    

