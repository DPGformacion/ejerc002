package es.cic.ejerc002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSumar() {
		Calculadora cut = new Calculadora();
		cut.sumar(1.1);
		cut.sumar(2.23);
		
		double resultado = cut.getResultado();
		assertEquals(3.33, resultado, 0.000001);
	}

	@Test
	void testRestar() {
		Calculadora cut = new Calculadora();
		cut.restar(-3.33);
		cut.restar(2.23);
		
		double resultado = cut.getResultado();
		assertEquals(1.1, resultado, 0.000001);
	}

	@Test
	void testMultiplicar() {
		Calculadora cut = new Calculadora();
		cut.sumar(1.5);
		cut.multiplicar(3);
		
		double resultado = cut.getResultado();
		assertEquals(4.5, resultado, 0.000001);
	}

	@Test
	void testDividir() {
		Calculadora cut = new Calculadora();
		cut.sumar(1.5);
		cut.dividir(0.5);
		
		double resultado = cut.getResultado();
		assertEquals(3, resultado, 0.000001);
	}

}
