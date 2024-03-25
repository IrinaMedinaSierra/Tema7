/*
Clase Persona, que se crea con sus atributos o características(variables) y sus métodos o comportamientos(funciones)
*/
package Explicacion.Clases;

public class Persona {
    public String nombre;
    public byte edad=0;
    public double estatura=0;
    public double peso=0;
    public String dni = null;

    //Métodos o comportamentos

    public void cumplirAnio(){
        System.out.println("Feliz Cumpleaños "+nombre);
        System.out.println("Tu edad ahora es " + (edad
        +1) + " años");
    }
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public void crecer(double incremento){
        estatura+=incremento;//reemplazamos el dato inicial de estatura
    }

}
