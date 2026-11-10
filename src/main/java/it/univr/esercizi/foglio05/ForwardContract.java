package it.univr.esercizi.foglio05;

public class ForwardContract extends FinancialProduct{
	
	private double spotPrice;
	private double deliveryPrice;
	
	ForwardContract(double maturity, double spotPrice, double deliveryPrice) {
		super(maturity);
		this.spotPrice = spotPrice;
		this.deliveryPrice = deliveryPrice;
	}
	
	@Override
	double getValue(DiscountCurve curve) {
		return spotPrice - (deliveryPrice * curve.getValue(getMaturity()));
	}

}
