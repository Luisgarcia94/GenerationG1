package com.generation.f20220523;

public class Ejercicio1 {

	public static void main(String[] args) {
		 //variables estaticas
		 double base = 5.5;
		 double altura = 3.2;
		 int constanteTriangulo = 2;
		 float PI = (float) 3.14;
		 float radio = (float) 0.25;
		 int constante = 2;
		 
		// formula area triangulo
		 double areaTriangulo = (base * altura)/constanteTriangulo;
		
		//formula perimetro circulo
		
		 float perimetro = (constante * PI * radio);
		 
		// Impresion Área triángulo
		
		System.out.println("***********************");
		System.out.println("El area del triangulo es : " + areaTriangulo);
		System.out.println("***********************");
		 	
		//Impresion Perímetro Círculo
		 
		System.out.println("***********************");
		System.out.println("El perímetro del circulo es : " + perimetro);
		System.out.println("***********************");
		 		
	}

}
