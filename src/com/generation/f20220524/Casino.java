package com.generation.f20220524;

import java.util.Scanner;

public class Casino {

	public static void main(String[] args) {
		//
		
	Scanner entrada = new Scanner(System.in);
	
	//Declarar variables
	
	String nombre,direccion,apellido;
	int saldoMin,saldo,edad,numero,edadMin,montoApuesta,apuestaMin;
	
	System.out.println("Bienvenido al Casino Java");
	
	//Inicializando variables estáticas
	
	edadMin = 18;
	saldoMin = 50000;
	apuestaMin = 10000;
	
	//Variables inicializadas por usuario
	
	System.out.println("Ingrese su nombre");
	nombre = entrada.nextLine();
	
	System.out.println("Ingrese su apellido");
	apellido = entrada.nextLine();
	
	System.out.println("Ingrese dirección");
	direccion = entrada.nextLine();
	
	System.out.println("Numero de domicilio");
	numero = entrada.nextInt();
	
	System.out.println("Ingrese su edad");
	edad = entrada.nextInt();
	
	
	if(edad > edadMin) { //Si es mayor de edad, puede acceder al sitio
		
		System.out.println("Bienvenido,recargue su saldo para apostar");
		System.out.println("");
		System.out.println("Ingrese saldo a recargar");
		
		saldo = entrada.nextInt();
		
		if(saldo > saldoMin) { //si el saldo es mayor al mínimo, puede apostar
			
			System.out.println("Recarga exitosa, su saldo es : " + saldo);
			System.out.println("");
			
			System.out.println("Ingrese su apuesta");
			montoApuesta = entrada.nextInt();
			
			if(montoApuesta > apuestaMin) { //monto de la apuesta debe ser mayor al minimo.
				System.out.println("Apuesta Exitosa,Buena suerte");
			}
			
			else {
				
				System.out.println("Error: Monto mínimo de apuesta: 10000");
			}
			
			
		}
		
		else{
			
			System.out.println("Saldo insuficente");
		} 
		
	}
	
	else {
		
		System.out.println("Sitio no autorizado para menores de edad");
	}
	
	
	}

}
