package it.univr.esercizi.foglio05;

public class Esercizio27 {

	public static void main(String[] args) {
		// int numberOfProducts = 2;
		FinancialProduct zeroCoupon = new ZeroCouponCorporateBond(3, "Alfa Spa", 1000.0);
		FinancialProduct fixedCoupon = new FixedCouponCorporateBond(3, "Beta SpA", 8000.0, 0.02);
		
		//FinancialProduct[] products = new FinancialProduct[numberOfProducts];
		FinancialProduct[] products = {zeroCoupon, fixedCoupon};
		FinancialPortfolio portfolio = new FinancialPortfolio(products);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore del portafoglio è: " + portfolio.getValue(curve));

	}

}
