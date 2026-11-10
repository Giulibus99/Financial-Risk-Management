package it.univr.lezioni.lezione03;

public class CashFlow { // Inizio corpo della classe
	
	// Attributi della classe
	double amount;
	double maturity;
	
	/* 
	 * COSTRUTTORE: creazione di oggetti
	 * Stesso nome della classe
	 * E' un metodo/funzione della classe
	 */
	public CashFlow(double inputAmount, double inputMaturity){ // Tra parentesi tonde inserisco gli input del metodo
		/*
		 * Prendi il campo amount di QUESTA istanza della classe e 
		 * riempilo/assegnalo con inputAmount
		 */
		this.amount = inputAmount;
		this.maturity = inputMaturity;
	}
	
	/*
	 * Creiamo un metodo che calcoli il valore attuale del flusso di cassa
	 * dato un tasso d'interesse
	 */
	public double getValue(double interestRate) {
		double discountFactor = Math.pow((1.0 + interestRate), -this.maturity);
		double result = amount * discountFactor;
		return result;
	}
	
	
	
	
	public void getAmount(){
		System.out.println("Il valore in euro è: " + this.amount);
	}
	
	public void changeAmount(double newAmount){
		this.amount = newAmount;
	}
	
}
