package com.generation.f20220525;

import java.util.Scanner;

public class Reforzamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        //escribe un programa que solicite el valor inferior y superior de un rango.

	        //A continuaci�n se van introduciendo n�meros hasta que introduzcamos el 0.

		 int limiteInferior, limiteSuperior,numero,sumaDentro,numFuera,numDentro;
		 
		 //Variables contadoras y acumuladoras debemos inicializarlas
		 sumaDentro = 0;
		 numDentro = 0;
		 numFuera = 0;
	        do {
	            System.out.println("Ingrese el limite Inferior");
	            limiteInferior = sc.nextInt();
	            System.out.println("Ingrese el limite superior");
	            limiteSuperior = sc.nextInt();           

	        }while(limiteInferior > limiteSuperior);

	        System.out.println("A continuacion ingresa tus n�meros\n,si quieres finalizar,ingresa un 0\n");
	        do {
	        	
	        	System.out.println("Ingresa tu n�mero");
	        	numero = sc.nextInt();
	        	
	        	if(numero >= limiteInferior && numero <= limiteSuperior) { //�consideramos limites?
	        		sumaDentro += numero;
	        	}
	        	if(numero < limiteInferior || numero > limiteSuperior) {
	        		
	        		numFuera++;
	        	}
	        	if(numero == limiteInferior || numero == limiteSuperior) {
	        		
	        		numDentro++;
	        	}

	        	
	        }while(numero!=0);
	        
	        System.out.println("La suma de los n�meros que est�n dentro del rango es: " + sumaDentro);
	        System.out.println("Cuantos n�meros est�n fuera del rango?\n " + numFuera);
	        System.out.println("Cuantos n�meros son igual a los valores del rango?\n " + numDentro);


	}

}
