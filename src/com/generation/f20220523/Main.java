package com.generation.f20220523;

public class Main {

	public static void main(String[] args) {
		// variables
		// variable tipo texto
		// Se define el tipo de dato al cuál pertenecera la variable
		// tipo de dato nombre_variable = asignacion;
		String nombre = "Luis \nGarcía";
		// Imprimir contenido de variable
		System.out.println(nombre);
		
		//16 bit (un solo caracter, entre comillas simples)
		char letraA = 'a';
		
		//variable tipo numérica
		// 32 bits
		int numeroInt = 28;
		System.out.println(numeroInt + 10);
		
		//8 bits
		byte numeroByte = 127;
		System.out.println(numeroByte);
		
		//16bits
		short numeroShort = 32767;
		System.out.println(numeroShort);
		
		//64 bits
		long numeroLong = 1999999999;
		System.out.println(numeroLong);
		
		//float y double (aceptan decimales)
		
		//variable booleana (true or false)
		
		boolean acepta = true;
		
		//Ejercicio rápido
		
		char genero = 'M';
		String colorDeCabello = "Negro";
		boolean comprometido = true;
		
		System.out.println("Genero : " + genero + "\n" + "Color de cabello : " + colorDeCabello + "\n" + "Comprometido : " + comprometido );
		
		int poblacion = 20000000;
		byte edad = 28;
		String nombre1 = "Luis Garcia";
		String ocupacion = "estudiante generation";
		char genero2 = 'M';
		
		System.out.println(ocupacion.charAt(11));
		
		//los strings se comparan con .equals, a diferencia de Javascript
		if(ocupacion.equals("estudiante generation")) System.out.println("La comparacion es verdadera");
	
		else System.out.println("la comparacion es falsa");
		if(ocupacion.toUpperCase().equals("ESTUDIANTE GENERATION")) System.out.println("verdadero");
	
		//Float y Double
		// cast es convertir un dato a otro tipo de dato
		float altura = (float) 1.73;//1.73f
		Float peso = 85.5f;
		
		//parse se utiliza para convertir un String a un tipo de numero;
		
		Float poblacion1 = Float.valueOf(poblacion);
		System.out.println(poblacion1.getClass());
		System.out.println(poblacion1);
		
		// de float a int, SE PIERDEN LOS DECIMALES
		// Float a Integer,SE PIERDEN LOS DECIMALES
		
		// operadores + - * / %
		// comparaciones < > <= >= == !=
	}

	
	
	
}
