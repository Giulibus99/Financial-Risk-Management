package it.univr.esercizi.foglio04;

/*
 * Esercizio 3 – CambioValutario 
 */

public class CambioValutario {

	private double dollariPerEuro;
	
	CambioValutario(double cambio) {
		this.dollariPerEuro = cambio;
	}
	
	public double converti(double euro) {
		return euro * this.dollariPerEuro;
	}
	public double converti(double euro, double commissioneEuro) {
		return((euro - commissioneEuro) * this.dollariPerEuro);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
