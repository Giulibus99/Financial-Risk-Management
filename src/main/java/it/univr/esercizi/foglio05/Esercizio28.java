package it.univr.esercizi.foglio05;

public class Esercizio28 {

	public static void main(String[] args) {
		FinancialProduct product = new FixedCouponCorporateBond(3, "Alfa SpA", 1000.0, 0.04);
		DiscountCurve curveCompound = new DiscountCurveCompoundInterest(0.05);
		DiscountCurve curveSimpleCurve = new DiscountCurveSimpleInterest(0.05);
		
		
		System.out.println("Il valore del bond in regime semplice: " + 
				product.getValue(curveSimpleCurve));
		System.out.println("Il valore del bond in regime composto: " + 
				product.getValue(curveCompound));
		

	}

}
