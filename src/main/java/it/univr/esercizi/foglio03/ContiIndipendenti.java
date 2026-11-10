package it.univr.esercizi.foglio03;

/*
 * Esercizio 02
 */

public class ContiIndipendenti {

	private double saldo;
	
	
	public void impostaSaldo(double saldoInput){
		this.saldo = saldoInput;
	}
	public void deposita(double deposito){
		this.saldo += deposito;
	}
	
	public void leggiSaldo(){
		System.out.println("Il saldo è: " + saldo);
	}
	
	public static void main(String[] args) {
		ContiIndipendenti conto01 = new ContiIndipendenti();
		ContiIndipendenti conto02 = new ContiIndipendenti();
		conto01.impostaSaldo(1000);
		conto02.impostaSaldo(500);
		conto01.deposita(200);
		conto01.leggiSaldo();
		conto02.leggiSaldo();

	}

}
