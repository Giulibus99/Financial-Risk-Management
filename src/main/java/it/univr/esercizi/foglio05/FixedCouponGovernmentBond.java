package it.univr.esercizi.foglio05;

public class FixedCouponGovernmentBond extends GovernmentBond {
	
	private double notional;
	private double couponRate;
	
	FixedCouponGovernmentBond(double years, String country, double notional, double couponRate) {
		super(years, country);
		this.notional = notional;
		this.couponRate = couponRate;
	}
	
	@Override
	 double getValue(DiscountCurve curve) {
		double result = notional * curve.getValue(getMaturity());
		double sum = 0.0;
		
		for (int k = 1; k <= getMaturity(); k++) {
			sum += curve.getValue(k);
		}
		result += ((notional * couponRate) * sum);
		
		return result;
	}

}
