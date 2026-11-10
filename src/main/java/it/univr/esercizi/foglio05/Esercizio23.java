package it.univr.esercizi.foglio05;

public class Esercizio23 {

	public static void main(String[] args) {
		ZeroCouponCorporateBond corporateBondZC = 
				new ZeroCouponCorporateBond(3.0 , "Alfa Spa", 1000);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore composto è: " + corporateBondZC.getValue(curve));

	}

}
