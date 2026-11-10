package it.univr.esercizi.foglio05;

public class Esercizio25 {

	public static void main(String[] args) {
		AmortizingCorporateBond amortizingBond = 
				new AmortizingCorporateBond(3, "Alfa SpA", 900.0, 0.06);
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.05);
		
		System.out.println("Il valore dell'obbligazione con ammortamento: " + 
				amortizingBond.getValue(curve));

	}

}
