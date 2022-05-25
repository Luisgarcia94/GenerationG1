package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mayoriaEdad = 18;
		System.out.println("Ingrese su edad");
		
		int edad = sc.nextInt();
		
		if(edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad, bienvenid@");
		}
		else {
			System.out.println("Ingreso no autorizado");
		}
		
	}

}
