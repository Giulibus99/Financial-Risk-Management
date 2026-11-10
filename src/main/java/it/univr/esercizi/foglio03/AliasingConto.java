package it.univr.esercizi.foglio03;

/*
 * Esercizio 11
 */

public class AliasingConto {

	private double saldo;
	
	private void impostaSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	private void deposita(double valoreDepositato) {
		this.saldo += valoreDepositato; 
	}
	
	private void leggiSaldo() {
		System.out.println("Il saldo è: " + this.saldo);
	}
	
	public static void main(String[] args) {
		AliasingConto primoConto = new AliasingConto();
		primoConto.impostaSaldo(750);
		/*
		 * Essendo che primoConto e secondoConto sono due oggetti non primitivi
		 * con l'operatore = non vado a copiare il valore nel nuovo oggetto, ma cambio
		 * la referenza. Dopo questa operazione non si avrà più il controllo 
		 * sull'oggetto primoConto che verrà eliminato da Java dalla memoria
		 */
		AliasingConto secondoConto = primoConto;
		secondoConto.deposita(50);
		
		primoConto.leggiSaldo();
		secondoConto.leggiSaldo();
		System.out.println("Primo conto == secondo conto? " + (primoConto==secondoConto));
		

	}

}
