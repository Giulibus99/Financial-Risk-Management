package it.univr.lezioni.lezione04;

public class CashFlowLesson4 {
	private double amount;
	private double maturity;

	
	/*
	 *  Non mettendo public o private i metodi o le variabil 
	 *  sono visibili SOLO all'interno del package
	 *  Con private solo all'interno della classe
	 */
	
	
	// Costruttore di default -> senza input
	CashFlowLesson4() {
		this.amount = 100.0;
		System.out.println("Costruttore di default");
	}
	
	CashFlowLesson4(double amount, double maturity) {
		this.maturity = maturity;
		this(); // Richiamo il costruttore di default senza parametri di input
		System.out.println("Costruttore non di default");
	}
	
	double getMaturity() {
		return this.maturity;
	}
	void getAmount() {
		System.out.println("Il saldo è: " + this.amount);
	}
	
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		CashFlowLesson4 valoreDefault = new CashFlowLesson4();
		System.out.println();
		CashFlowLesson4 valore = new CashFlowLesson4(18.0, 7.0);
		System.out.println();
		CashFlowLesson4 valore1 = new CashFlowLesson4();
		System.out.println();
		// Non ho ancora inizializzato il saldo
		valore1.getAmount();
		
		/*
		 *  Inizializzo i parametri dell'istanza valore1,
		 *  che è stato generato dal costruttore di default
		 */
		valore1.amount = 11.0;
		valore1.maturity = 8.0;
		
		System.out.println();
		valoreDefault.getAmount();
		System.out.println();
		valore.getAmount();
		System.out.println();
		valore1.getAmount();
		
		valore1.setAmount(200);
		valore1.getAmount();
		System.out.println("Maturity: " + valore1.getMaturity());
		
		
	}

}
