package com.generation.f20220525;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// menu
		System.out.println("Ingrese opción:");
		System.out.println("1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:// sumar
				// accion para la opcion 1
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
			System.out.println("opcion invalida");
			break;
		}

		System.out.println("Fuera del Switch");
	}

}
