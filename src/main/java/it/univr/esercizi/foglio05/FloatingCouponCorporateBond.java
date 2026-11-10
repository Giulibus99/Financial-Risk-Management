package it.univr.esercizi.foglio05;

public class FloatingCouponCorporateBond extends CorporateBond{
	
	private double[] annualForwardRates;
	private double notional;
	private double spread;
	
	FloatingCouponCorporateBond(String issuer, double notional, double spread, double[] annualForwardRates) {
		super(annualForwardRates.length, issuer);
		
		this.annualForwardRates = new double[annualForwardRates.length];
		for (int i = 0; i < annualForwardRates.length; i++) {
			this.annualForwardRates[i] = annualForwardRates[i];
		}
		this.notional = notional;
		this.spread = spread;
	}

	@Override
	double getValue(DiscountCurve curve) {
		double result = notional * curve.getValue(annualForwardRates.length);
		double sum = 0.0;
		
		for (int k = 1; k <= annualForwardRates.length; k++) {
			sum += (annualForwardRates[k-1] + spread) * curve.getValue(k);
		}
		
		result += (notional * sum);

		return result;
	}
}
