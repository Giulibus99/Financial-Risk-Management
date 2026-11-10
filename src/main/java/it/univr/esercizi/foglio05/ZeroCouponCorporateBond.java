package it.univr.esercizi.foglio05;

public class ZeroCouponCorporateBond extends CorporateBond {
	
	private double notional;
	
	ZeroCouponCorporateBond(double maturity, String issuer, double notional) {
		super(maturity, issuer);
		this.notional = notional;
	}

	/*
	 *  Il campo maturity è privato nella classe "madre" FinancialProduct
	 *  Per accedervi devo utilizzare il getter
	 */
	@Override
	double getValue(DiscountCurve curve) {
		return notional * curve.getValue(getMaturity());
	}
}
