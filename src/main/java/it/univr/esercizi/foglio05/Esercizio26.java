package it.univr.esercizi.foglio05;

public class Esercizio26 {

	public static void main(String[] args) {
	
		double[] forwardRates = {0.03, 0.04, 0.05};
		
		FloatingCouponCorporateBond bond = 
				new FloatingCouponCorporateBond("Alfa SpA", 1000.0, 0.01, forwardRates);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore di questo bond con cedole variabili e tassi forward dati: " +
				bond.getValue(curve));
		

	}

}
