package com.generation.f20220523;

public class CalculodePromedio {

	public static void main(String[] args) {
		// Almacenar calificaciones de distintas materias en variables
		// Creaci�n de un alumno
		// Asignar al alumno estas calificaciones
		// Calcular el promedio final
		// Si el promedio final es menor a 50, informarle al alumno que reprob�, si es mayor
		// informarle que aprob�.
		
		//Para realizar la verificacion final, usar�a operador < para comparar promedio final con 
		// nota m�nima de aprobaci�n. 
		// Para calcular el promedio, usar�a operador de suma y divisi�n. 
		
		//int cantidadDeNotas = 12;
		
		Integer sumaNotas = 0;
		Integer[] notas = {20,47,67,0,0,25,88,77,58,79,33,50};
		float promedio = 0;
		
		for (int i = 0; i < notas.length; i++) {
			sumaNotas += notas[i];
		}
		
		if(sumaNotas % notas.length != 0) {
			float sum = sumaNotas.floatValue();
			
			promedio = sum/notas.length;
			System.out.println(promedio);
		
		}
		else {
			promedio = sumaNotas/notas.length;
			System.out.println(promedio);
		}
		
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("Alumno ha aprobado");
		}
		else {
			System.out.println("Alumno ha reprobado");
		}
		
		


	}

}
