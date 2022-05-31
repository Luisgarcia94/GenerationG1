package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //creamos instancias
    Alumno alumno1 = new Alumno("Luis","Garcia",28,"G1");
    Alumno alumno2 = new Alumno("Cristobal","Hapsoo",23,"G1");
    Alumno alumno3 = new Alumno("Alejandro","Heredia",29,"G1");
    Alumno alumno4 = new Alumno("Joao","Aranda",28,"G1");
    Alumno alumno5 = new Alumno("Cristian","Yañez",26,"G1");

    //Impresion

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
        System.out.println(alumno5.toString());
        System.out.println();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        System.out.println(listaAlumnos); // Cuando trato de imprimir la lista, imprimo internamente el toString()
        System.out.println(listaAlumnos.get(0).getApellido());

    }
}
