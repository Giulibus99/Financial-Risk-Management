package it.univr.esercizi.foglio05;

public class FinancialProduct {
	
	private double maturity;

	FinancialProduct(double maturity) {
		this.maturity = maturity;
	}
	
	double getMaturity() {
		return this.maturity;
	}
	
	double getValue(DiscountCurve curve) {
		return 0.0;
	}
}
