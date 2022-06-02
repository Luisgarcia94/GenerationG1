package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;
import com.generation.f20220601.modelos.Pollo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		Mascota mascota = new Mascota(); //Mascota instanciada
		
		Perro perrito = new Perro();
		
		Gato gatito = new Gato(); //Gato instanciado
		
		perrito.setNombre("iñaki");
		
		Mishi gataEmilia = new Mishi(); //Mishi instanciado
		
		Mascota regalon = new Mascota("Can","Firulais","Pelo","Macho",8.5f,"negro",true);
		
		List <Mascota> listaDeMascotas = new ArrayList<Mascota>();
		
		listaDeMascotas.add(regalon);
		
		Mascota felix = new Gato();
		
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		listaDeMascotas.add(felix);
		
		Mascota chocolo = new Perro();
		
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Café");
		chocolo.setPeso(10);
		listaDeMascotas.add(chocolo);
		
		regalon.hacerSonido(); //llamamos al método
		felix.hacerSonido();
		chocolo.hacerSonido();
		System.out.println("*******");
		System.out.println("*******");
		
		Mascota piopio = new Pollo();
		
		listaDeMascotas.add(piopio);
		
		for (Mascota mascota2 : listaDeMascotas) {
			
			System.out.println("La clase es : " + mascota2.getClass().getSimpleName());
			System.out.print("El sonido que hace es : ");
			mascota2.hacerSonido();
		}
	
		


		
	
		
		
		
		
		

	}

}
