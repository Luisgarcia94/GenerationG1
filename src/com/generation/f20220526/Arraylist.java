package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args){
        /*
        ArrayList
        instancia de clase, definicion de tipo de Arreglo
        */
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        colores.add("holi");
        System.out.println(colores);
        colores.add("holaaa");
        System.out.println(colores);
        System.out.println(colores.get(0));
        System.out.println(colores.size());
        //quitar todos los elementos
        //colores.clear();
        colores.add("asd");
        colores.add("ytreas");
        System.out.println(colores);
        System.out.println("****************");
        //Para recorrer un arraylist, se puede usar for y foreach de manera tradicional
        //no olvidar que en caso de arraylists, se usa array.size() y  no array.length
        System.out.println("Ejecutando el foreach");
        for (String a:
             colores) {
            System.out.println(a);
        }

        System.out.println("El arreglo antes de sort es: " + colores);
        //Ordenar arreglo

        Collections.sort(colores); //no es temporal
        System.out.println("El arreglo despues de sort es: " + colores);
        Collections.reverse(colores); //invertir el orden, no ordena descendentemente, solo invierte el orden.
        System.out.println("El arreglo despues de reverse es: " + colores);
    }
}
