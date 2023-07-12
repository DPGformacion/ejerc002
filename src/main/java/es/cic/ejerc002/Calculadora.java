package es.cic.ejerc002;

public class Calculadora {
	
	private double resultado;
	
	void sumar(double sumando) {
		this.resultado += sumando;
	}
	
	void restar(double substraendo) {
		this.resultado -= substraendo;
	}
	
	void multiplicar(double factor) {
		this.resultado *= factor;
	}
	
	void dividir(double divisor) {
		this.resultado /= divisor;
	}

	public double getResultado() {
		return resultado;
	}
	
}
