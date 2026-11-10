package it.univr.esercizi.foglio05;

public class Esercizio24 {

	public static void main(String[] args) {
		FixedCouponCorporateBond bond = new FixedCouponCorporateBond(3, "Alfa Spa", 1000.0 , 0.04);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore è: " + bond.getValue(curve));

	}

}
