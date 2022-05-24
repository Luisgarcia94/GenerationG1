package com.generation.f20220524;

public class CalculodePromedio {

	public static void main(String[] args) {
		// Almacenar calificaciones de distintas materias en variables
		// Creación de un alumno
		// Asignar al alumno estas calificaciones
		// Calcular el promedio final
		// Si el promedio final es menor a 50, informarle al alumno que reprobó, si es mayor
		// informarle que aprobó.
		
		//Para realizar la verificacion final, usaría operador < para comparar promedio final con 
		// nota mínima de aprobación. 
		// Para calcular el promedio, usaría operador de suma y división. 
		
		//int cantidadDeNotas = 12;
		
		
		Integer[] notas = {20,47,67,30,69,25,88,77,58,79,33,50};
		int sumaNotas = 0;
		int notasFueraDeRango = 0;
		
		for (int i = 0; i < notas.length; i++) {
			//validar la nota, contar cuantas notas estan fuera de rango
			if(notas[i] < 0 || notas[i] > 100) {
				
				System.out.println("La nota " + notas[i] + " en la posición: " + (i + 1) + " está fuera de rango");
				notasFueraDeRango++;
				
			}
			sumaNotas += notas[i]; // accedemos a los valores de notas,sumamos y actualizamos valor
		}
		
		//System.out.println("Suma de notas : " + sumaNotas); informativo para nosotros
		
		
		if(notasFueraDeRango == 0) {
		float promedio = sumaNotas / notas.length;
		
		//PUNTOS CRITICOS: AQUELLOS QUE NOS ESTAN ESTABLECIENDO LA PROBLEMÁTICA
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("Promedio final : " + promedio + " \nAlumno ha aprobado");
		}else if(promedio > 0 && promedio < 50) {
			System.out.println("Promedio final : " + promedio + " \nAlumno ha reprobado");
		}
		}
		else {
			System.out.println("Promedio inválido, verifique las notas\n e inténtelo nuevamente");
		}
		
		
		

		
	
		


	}

}
