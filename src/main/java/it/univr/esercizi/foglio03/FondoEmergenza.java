package it.univr.esercizi.foglio03;

/*
 * Esercizio 09 
 */

public class FondoEmergenza {

	private int saldo;
	private int soglia;
	private int versamento;
	
	public void configura(int saldo, int soglia, int versamento) {
		this.saldo = saldo;
		this.soglia = soglia;
		this.versamento = versamento;
	}
	
	public int eseguiVersamenti() {
		int numeroVersamenti = 0;
		
		do {
			this.saldo += this.versamento;
			numeroVersamenti++;
		} while (this.saldo < this.soglia);
		
		return numeroVersamenti;
	}
	
	public void leggiSaldo() {
		System.out.println("Il saldo attuale è: " + this.saldo);
	}
	public static void main(String[] args) {
		FondoEmergenza fondo = new FondoEmergenza();
		fondo.configura(1150, 1000, 100);

		System.out.println("Numero versamenti: " + fondo.eseguiVersamenti());
		fondo.leggiSaldo();
	}

}
