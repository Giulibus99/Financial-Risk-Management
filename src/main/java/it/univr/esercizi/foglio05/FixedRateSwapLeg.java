package it.univr.esercizi.foglio05;

public class FixedRateSwapLeg extends FinancialProduct{
	
	private double notional;
	private double rate;
	
	/*
	 *  Utilizzo il campo della super classe. Anche nel ciclo uso 
	 *  il metodo getter per accedere al campo private
	 */
	private int maturity;
	
	FixedRateSwapLeg(double notional, double rate, int maturity) {
		super(maturity);
		this.notional = notional;
		this.rate = rate;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		double result = notional * rate;
		double discount = 0.0;
		
		for (int k = 1; k <= getMaturity(); k++) {
			discount += curve.getValue(k);
		}
		
		return result * discount;
	}

}
