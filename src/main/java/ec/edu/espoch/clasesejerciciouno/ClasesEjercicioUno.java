/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clasesejerciciouno;

/**
 *
 * @author PERSONAL
 */
public class ClasesEjercicioUno {

    public static void main(String[] args) {
        
        Coche objCocheUno = new Coche();
        
        objCocheUno.idCoche=100;
        System.out.println("El id del coche es: "+objCocheUno.idCoche );
        objCocheUno.color= "blanco";
        System.out.println("El color del coche es:"+objCocheUno.color);
        objCocheUno.marca="Mazda";
        System.out.println("La marca del cohce es: "+objCocheUno.marca);
        objCocheUno.modelo="cuadrado";
        System.out.println("Cual es el modelo del coche: "+objCocheUno.modelo);
        objCocheUno.estado = true ;
        System.out.println("Cual es el estado del coche : "+objCocheUno.estado);
        
        System.out.println("DATOS DE  MI OBJETO NUMERO UNO");
        
        
        
        Persona objPersona= new Persona();
        
        objPersona.idPersona="3018";
        objPersona.nombre="Pulupa";
        objPersona.edad=20;
        System.out.println("El id de la persona es : "+objPersona.idPersona);
        System.out.println("El nombre de la persona es : "+objPersona.nombre);
        System.out.println("La edad es : " +objPersona.edad);
        
        
        Persona objPersonaDos= new Persona();
        
        objPersonaDos.idPersona="3022";
        objPersonaDos.nombre="Cristhian";
        objPersonaDos.edad=21;
        System.out.println("El id de la persona es : "+objPersonaDos.idPersona);
        System.out.println("El nombre de la persona es : "+objPersonaDos.nombre);
        System.out.println("La edad es : " +objPersonaDos.edad);
        
        
        
        
            }
    
    
}
