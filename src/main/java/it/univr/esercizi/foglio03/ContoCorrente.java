package it.univr.esercizi.foglio03;

/*
 * Esercizio 01
 */

public class ContoCorrente {
	
	private double saldo;
	
	
	public ContoCorrente() {
		
	}
	public void impostaSaldo(double inputSaldo){
		this.saldo = inputSaldo;
	}
	
	public void deposita(double deposito){
		this.saldo += deposito;
	}
	
	public void leggiSaldo() {
		System.out.println("Il saldo è " + saldo);
	}

	public static void main(String[] args) {
		double saldo = 1500;
		ContoCorrente conto01 = new ContoCorrente();
		conto01.impostaSaldo(saldo);
		conto01.deposita(250);
		conto01.leggiSaldo();
	}

}
