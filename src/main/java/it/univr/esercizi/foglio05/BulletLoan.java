package it.univr.esercizi.foglio05;

public class BulletLoan extends Loan{
	
	private double annualRate;
	
	BulletLoan(double principal, double annualRate, int years) {
		super(years, principal);
		this.annualRate = annualRate;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		double result = principal * curve.getValue(getMaturity());
		double sum = 0;
		
		for (int k = 1; k <= getMaturity(); k++) {
			sum += curve.getValue(k);
		}
	
		result += (principal * annualRate * sum);
		
		
		return result;
	}
	
	
	

}
