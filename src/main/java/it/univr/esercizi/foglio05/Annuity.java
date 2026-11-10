package it.univr.esercizi.foglio05;

public class Annuity {
	
	private CashFlow[] cashFlows;
	
	public Annuity(CashFlow[] cashFlows) {
		this.cashFlows = new CashFlow[cashFlows.length];
		for (int i = 0; i < cashFlows.length; i++) {
			this.cashFlows[i] = cashFlows[i];
			
		}
	}
	
	double getValue(DiscountCurve curve) {
		double result = 0.0;
		for (int i = 0; i < cashFlows.length; i++) {
			result += cashFlows[i].getValue(curve);
		}
		
		return result;
	}

}
