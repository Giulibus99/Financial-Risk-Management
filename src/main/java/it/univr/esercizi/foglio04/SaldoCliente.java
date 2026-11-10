package it.univr.esercizi.foglio04;

/*
 * Esercizio 09 - SaldoCliente
 */

public class SaldoCliente {

	private double saldo;
	
	SaldoCliente(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double cash) {
		this.saldo += cash;
	}
	
	public double leggiSaldo() {
		return this.saldo;
	}
	
}
