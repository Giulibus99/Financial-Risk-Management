package it.univr.esercizi.foglio05;

public class LevelPaymentLoan extends Loan {
	
	private double annualRate;
	
	LevelPaymentLoan(double principal, double maturity, double annualRate) {
		super(maturity, principal);
		this.annualRate = annualRate;
	}
	
	double getAnnualPayment() {
		double annualPayment = principal / getMaturity();
		if (annualRate != 0) {
			annualPayment = (principal * annualRate) / 
					(1.0 - Math.pow((1.0 + annualRate), -getMaturity()));
		}
		return annualPayment;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		double sum = 0.0;
		
		for (int k = 1; k <= getMaturity(); k++) {
			sum += curve.getValue(k);
		}
		
		return getAnnualPayment() * sum;
		
	}

}
