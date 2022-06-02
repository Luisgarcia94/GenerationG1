package com.generation.f20220601.pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	void test() {
	
		Calculadora calc = new Calculadora();
		
		assertEquals(54, calc.suma(12, 42));
		assertEquals(-30, calc.resta(12, 42));
		assertEquals(504, calc.multiplicacion(12, 42));
		assertEquals("0", calc.division(12,42));
		assertTrue(true,calc.division(12,42));
		
		
		
	}

}
