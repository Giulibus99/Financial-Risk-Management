package it.univr.esercizi.foglio05;

public class Esercizio40 {

	public static void main(String[] args) {
		double[] forwardRates = {0.035, 0.045, 0.055};
		double fixedRate = 0.04;
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		InterestRateSwap swap = 
				new InterestRateSwap(forwardRates.length, 1000.0, fixedRate, forwardRates);

		System.out.println("Il valore dello swap è: " + swap.getValue(curve));
		
		FinancialProduct[] products = new FinancialProduct[3];
		products[0] = swap;
		products[1] = new ZeroCouponCorporateBond(3, "Prova", 1000);
		products[2] = new EuropeanCallOption(4, 120, 100);
		
		FinancialPortfolio portfolio = new FinancialPortfolio(products);
		
		System.out.println("Il valore del portafoglio è: " + portfolio.getValue(curve));
		
	}

}
