package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220526.Arraylist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		
		cliente.setId(1234);
		cliente.setNombre("Luis");
		cliente.setRut("18466805-k");
		
		System.out.println(cliente.toString());
		
		//Excepciones
		
		Cliente clienteDatosDinamicos = new Cliente();
		
		
		//String idString = sc.nextLine();
		
		int opcion = 0;

		do {
			try {
			System.out.println("Ingrese el id de Cliente");
			int id2 = sc.nextInt();
			clienteDatosDinamicos.setId(id2);
			sc.nextLine();

			System.out.println("Ingrese el nombre de Cliente");
			String nombre = sc.nextLine();
			clienteDatosDinamicos.setNombre(nombre);

			// rut
			System.out.println("Ingrese el rut de Cliente");
			String rut = sc.nextLine();
			clienteDatosDinamicos.setRut(rut);

			// correo
			System.out.println("Ingrese el correo de Cliente");
			String correo = sc.nextLine();
			clienteDatosDinamicos.setCorreo(correo);
			
			System.out.println("Ingrese (1) para añadir otro cliente, (0) para salir");
			opcion = sc.nextInt();
			
		} catch(NullPointerException npe) {
			System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
		} catch (InputMismatchException ime) {
			System.out.println("Error en el ingreso de un dato");
		} catch (NumberFormatException nfe) {
			System.out.println("No puede ingresar un letra como identificador " + nfe);
		}
		catch(ArithmeticException ae) {
				System.out.println("Error al dividir por cero");
			}
		 catch (Exception e) {
			System.out.println("Ha ocurrido un error, contecte al administrador " + e);
		}	
		} while(opcion < 0 || opcion > 1);	
	}

}
