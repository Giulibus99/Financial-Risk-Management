package it.univr.esercizi.foglio04;

/*
 * Esercizio 7 – Rendita finanziaria
 * Codice dato dall'esericizio
 */

/*
 * Un pagamento di ammontare amount alla data maturity. 
 */

public class Cashflow {
	private double amount;
	private double maturity;
	public Cashflow() {
	}
	
	// Se la scadenza non e’ indicata, il pagamento avviene al tempo zero.
	public Cashflow(double amount) {
		this();
		this.amount = amount;
	}
	
	public Cashflow(double amount, double maturity) {
		// this() deve essere la prima istruzioni
		this(amount);
		this.maturity = maturity;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getMaturity() {
		return maturity;
	}
	
	public void setMaturity(double maturity) {
		this.maturity = maturity;
	}
	/*
	 * Valore attuale al tasso di interesse annuo composto. 
	 */
	public double getValue(double interestRate) {
		double discountFactor = Math.pow(1.0 + interestRate, -maturity);
		return amount * discountFactor;
	}
	}