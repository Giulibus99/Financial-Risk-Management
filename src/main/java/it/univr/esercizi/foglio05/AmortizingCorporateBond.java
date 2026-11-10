package it.univr.esercizi.foglio05;

public class AmortizingCorporateBond extends CorporateBond {
	
	private double notional;
	private double couponRate;
	
	AmortizingCorporateBond(int years, String issuer, double notional, double couponRate) {
		super(years, issuer);
		this.notional = notional;
		this.couponRate = couponRate;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		double constantCoupon = notional / getMaturity();
		double result = 0.0; 
		
		for (int k = 1; k <= getMaturity(); k++) {
			result += (constantCoupon + couponRate * 
					(notional - ((k - 1.0) * constantCoupon))) * curve.getValue(k);			
		}
		
		return result;
	}

}
