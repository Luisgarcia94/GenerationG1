package com.generation.f20220525;

import java.util.Scanner;

public class Bucle_while {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese opción:");
		System.out.println("1 sumar\n2 restar\n3 multiplicar\n4 dividir");
		int opcion = input.nextInt();
		while (opcion < 0 || opcion > 4) {
			
			System.out.println("Ingresa una opción válida");
			opcion = input.nextInt();
		}
		
		switch (opcion) {
		case 1:
			System.out.println("** Suma");
			break;
		case 2:
			System.out.println("** Resta");
			break;
		case 3:
			System.out.println("** Multiplicacion");
			break;
		case 4:// division
			System.out.println("** Division");
			break;
		default:
			System.out.println("Regrese Pronto");
			break;
		}
		
		int termino = 0;
		
		while(termino <= 10 ) {
			System.out.println("el valor de termino es "+ termino);
			termino++;
		}

	}
}
