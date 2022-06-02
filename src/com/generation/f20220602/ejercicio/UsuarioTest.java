package com.generation.f20220602.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	  @Test
		public void testLogin() {
			Usuario usuarioPrueba = new Usuario();
			boolean consulta = usuarioPrueba.login("nombreUsuario","test123");
			assertEquals(true , consulta);
		}
	  
	  @Test
		public void testPregunta() {
			Cliente clientePrueba = new Cliente();
			String pregunta = clientePrueba.hacerPreguntas("Esta es una pregunta de prueba");
			assertEquals("Esta es una pregunta de prueba" , pregunta);
	  }
	    
	  @Test
		public void testRespuesta() {
			Vendedor vendedorPrueba = new Vendedor();
			String respuesta = vendedorPrueba.respondePreguntas("Esta es una respuesta de prueba");
			assertEquals("Esta es una respuesta de prueba" , respuesta);
		}  

}
