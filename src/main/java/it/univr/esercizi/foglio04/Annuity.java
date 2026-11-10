package it.univr.esercizi.foglio04;

// Esercizio 7 – Rendita finanziaria

public class Annuity {
	
	private Cashflow[] cashflows;
	
	public Annuity(Cashflow[] cashflows) {
		this.cashflows = cashflows;
	}

	double getTotalAmount() {
		double totalAmount = 0.0;
		
		for (int i = 0; i < cashflows.length; i++) {
			totalAmount += cashflows[i].getAmount();
		}
		return totalAmount;
	}
	
	double getValue(double interestRate) {
		double finalResult = 0.0;
		for (int i = 0; i < cashflows.length; i++) {
			finalResult += cashflows[i].getValue(interestRate);
		}
		return finalResult;
	}

}
