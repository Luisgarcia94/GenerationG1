package com.generation.f20220526;

import java.util.Arrays;

public class ArrayFijos {public static void main(String[] args){

    //Array ESTATICOS
    String[] colores = {"red","yellow","green","black"};
    Integer[] numeros = {0,30,50,60,30,5};
    int [] primerosNumeros= {0,1,2,3,4,5,6,7};

    System.out.println(colores[0]);
    System.out.println(numeros[4]);
    System.out.println(primerosNumeros[2]);

    numeros[0] = 34; //modificando numero del elemento
    System.out.println(numeros[0]);

    System.out.println(numeros.length);
    //System.out.println(numeros[8]); //Diferente a Javascript, si
                                    // el indice a buscar supera la
                                    // extension del arreglo, arroja error.

    System.out.println(colores.toString());
    System.out.println(numeros.toString());
    System.out.println(primerosNumeros.toString());

    System.out.println(Arrays.toString(colores)); //Imprimir el contenido de un arreglo

    //recorrer un arreglo

    for (int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
    }

    System.out.println("*****************\n");

    for (int i: numeros) { //equivalente a for of de javascript
        System.out.println(i);
    }
}
}
