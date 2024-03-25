package Explicacion.Controlador;

import Explicacion.Clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p=new Persona(); //Estoy declarando que p es un objeto de tipo Persona
        p.nombre="Fran";
        p.edad=32;
        p.peso=65;
        p.estatura=1.78;
        p.dni="06521487G";

        System.out.println(" Nombre->"+p.nombre
                            +"\n Edad->"+p.edad
                            + "\n Peso-> "+p.peso
                            + "\n Estatura->" +p.estatura
                            + "\n DNI-> " + p.dni);

        Persona x=new Persona();
        x.nombre="Isabel";
        x.edad=35;
        x.peso=65;
        x.estatura=1.65;
        x.dni="06852145B";
        //debia ser una funcion
        System.out.println(" Nombre->"+x.nombre
                +"\n Edad->"+x.edad
                + "\n Peso-> "+x.peso
                + "\n Estatura->" +x.estatura
                + "\n DNI-> " + x.dni);
        x.cumplirAnio();
        p.crecer(-0.05);
        System.out.println(p.nombre + " ahora mida " + p.estatura );

        x.saludar();
    }


}
