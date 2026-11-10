package it.univr.esercizi.foglio05;

public class Loan extends FinancialProduct {
	
	protected double principal;
	
	Loan(double maturity, double principal) {
		super(maturity);
		this.principal = principal;
	}

	
	double getPrincipal() {
		return this.principal;
	}
	
	double getValue() {
		return 0.0;
	}
}
