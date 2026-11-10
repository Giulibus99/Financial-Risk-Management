package it.univr.esercizi.foglio04;

/*
 * Esercizio 1 – ContoVincolato
 */

public class ContoVincolato {
	
	private double capitale;
	private double tasso;
	
	public ContoVincolato(double capitale, double tasso) {
		this.capitale = capitale;
		this.tasso = tasso;
	}
	
	public double montante(int anni) {
		double result = this.capitale;
		for (int i = 0; i < anni; i++) {
			result *= (1.0 + this.tasso);
		}
		return result;
	}

}
