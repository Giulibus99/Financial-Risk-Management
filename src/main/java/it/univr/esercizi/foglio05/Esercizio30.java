package it.univr.esercizi.foglio05;

public class Esercizio30 {

	public static void main(String[] args) {
		FixedCouponGovernmentBond fixedGovBond = new FixedCouponGovernmentBond(3, "Italy", 1000.0, 0.03);
		
		DiscountCurve curve = new DiscountCurveCompoundInterest(0.04);
		
		System.out.println("Il prezzo è: " + fixedGovBond.getValue(curve));
		System.out.println("L'emittente è: " + fixedGovBond.getCountry());

	}

}
