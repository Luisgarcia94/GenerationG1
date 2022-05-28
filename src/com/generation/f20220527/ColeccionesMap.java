package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Colecciones Map
		//Pares Clave  <-> valor
		//HashMap<K, V> map = new HashMap<K, V>
		// k key o clave; V value o valor 
		//HashMap mapa = new HashMap();
		//Los hashMaps no trabajan con posiciones, si no que con clave:valor
		
		
		
		//crear coleccion
		HashMap objHashMap= new HashMap();
		
		//asignando pares llave = valor
		objHashMap.put("Nombre", "Luis"); 
		System.out.println(objHashMap);
		objHashMap.put("ApellidoP", "García");
		System.out.println(objHashMap);
		objHashMap.put("ApellidoM", "Vera");
		System.out.println(objHashMap);
		objHashMap.put("Edad", "28");
		System.out.println(objHashMap);
		
		//Obtener un valor a traves de la clave
		System.out.println(objHashMap.get("Nombre")); 
		
		// eliminar par
		
		objHashMap.remove("Edad");
		System.out.println(objHashMap);
		
		//mostrar todas las llaves disponibles
		
		System.out.println(objHashMap.keySet());
		
		// mostrar todos los valores disponibles
		
		System.out.println(objHashMap.values());
		
		ArrayList<String> vocales = new ArrayList<String>();
		
		vocales.add("a");
		vocales.add("b");
		vocales.add("c");
		vocales.add("d");
		vocales.add("e");
		
		objHashMap.put("vocales", vocales);
		
		System.out.println(objHashMap);
		
		//si no encuentra una clave,retorna null
		System.out.println(objHashMap.get("vocales"));
		
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 
			
		}

		
		//crear un Menu
		
		// Elegir una opcion
		
		// Que esa opcion 
		

	}

}
