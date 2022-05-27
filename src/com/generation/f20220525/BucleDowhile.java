package com.generation.f20220525;

import java.util.Scanner;

public class BucleDowhile {

	public static void main(String[] args) {

		// DoWhile

		/*
		 * int termino = 20;
		 * 
		 * do { System.out.println("El valor de término es " + termino); } while
		 * (termino <= 10);
		 * 
		 * while (termino <= 10) {
		 * 
		 * 
		 * System.out.println("probando segundo while"); }
		 */
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();

		} while (opcion < 0 || opcion > 4);

	}

}
