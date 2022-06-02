package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora calc = new Calculadora();

	@Test
	void testSuma() {
		assertEquals(54, calc.suma(12, 42));
	}

	@Test
	void testResta() {
		assertEquals(-30, calc.resta(12, 42));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(504, calc.multiplicacion(12, 42));
	}

	@Test
	void testDivision() {
		assertEquals("0", calc.division(12,42));
	}
	
	@Test
	
	void testEsPar() {
		
		boolean resultado = calc.esPar(4);
		assertTrue(resultado); // Validar que resultado sea true
		assertNotNull(resultado); //Validar que resultado no sea Null
		assertNotSame(false, resultado); //Validar que argumentos sean distintos
		
	}
	
	
	@Test
	void testEsImpar() {
		boolean resultado = calc.esImpar(6); 
		assertFalse(resultado); //Validar que resultado sea Falso
	}

}
