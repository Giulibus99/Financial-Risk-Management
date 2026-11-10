package it.univr.esercizi.foglio05;

public class FinancialPortfolio {
	private FinancialProduct[] products;
	
	FinancialPortfolio(FinancialProduct[] products) {
		this.products = new FinancialProduct[products.length];
		
		for (int i = 0; i < products.length; i++) {
			 this.products[i] = products[i];
		}
	}

	double getValue(DiscountCurve curve) {
		double value = 0.0;
		
		for (int i = 0; i < products.length; i++) {
			value += products[i].getValue(curve);
		}
		
	return value;
	}
	
}
