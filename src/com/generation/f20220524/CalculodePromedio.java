package com.generation.f20220524;

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
		
		
		Integer[] notas = {20,47,67,30,69,25,88,77,58,79,33,50};
		int sumaNotas = 0;
		int notasFueraDeRango = 0;
		
		for (int i = 0; i < notas.length; i++) {
			//validar la nota, contar cuantas notas estan fuera de rango
			if(notas[i] < 0 || notas[i] > 100) {
				
				System.out.println("La nota " + notas[i] + " en la posici�n: " + (i + 1) + " est� fuera de rango");
				notasFueraDeRango++;
				
			}
			sumaNotas += notas[i]; // accedemos a los valores de notas,sumamos y actualizamos valor
		}
		
		//System.out.println("Suma de notas : " + sumaNotas); informativo para nosotros
		
		
		if(notasFueraDeRango == 0) {
		float promedio = sumaNotas / notas.length;
		
		//PUNTOS CRITICOS: AQUELLOS QUE NOS ESTAN ESTABLECIENDO LA PROBLEM�TICA
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("Promedio final : " + promedio + " \nAlumno ha aprobado");
		}else if(promedio > 0 && promedio < 50) {
			System.out.println("Promedio final : " + promedio + " \nAlumno ha reprobado");
		}
		}
		else {
			System.out.println("Promedio inv�lido, verifique las notas\n e int�ntelo nuevamente");
		}
		
		
		

		
	
		


	}

}
