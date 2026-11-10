package it.univr.esercizi.foglio04;

/*
 * Esercizio 4 – ContoTrading
 */

public class ContoTrading {

	/*
	 *  Con INCAPSULAMENTO si intende che non è possibile accedere 
	 *  direttamente a campi e metodi a causa di private
	 */
	
	// Il campo private non è direttamente accessibile
	private double saldo;
	
	public ContoTrading(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean preleva (double importo) {
		boolean result;
		if (importo > 0 && importo <= this.saldo) {
			result = true;
			this.saldo -= importo;
		} else {
			result = false;
		}
		
		return result;
	}
	
	/*
	 *  Devo scrivere un metodo ad hoc per leggere o modificare 
	 *  il campo private della classe.
	 *  leggiSaldo è un metodo cosiddetto getter
	 */
	public void leggiSaldo() {
		System.out.println("Il saldo attuale è: " + this.saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldoNew) {
		this.saldo = saldoNew;
	}
	


}
