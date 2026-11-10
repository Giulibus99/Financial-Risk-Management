package it.univr.esercizi.foglio05;

public class Esercizio20 {

	public static void main(String[] args) {
		int numberOfCashflows = 3;
		CashFlow[] cashFlows = new CashFlow[numberOfCashflows];
		
		for (int i = 0; i < numberOfCashflows; i++) {
			cashFlows[i] = new CashFlow(100.0, i+1);
		}
		
		
		DiscountCurve baseCurve = new DiscountCurve();
        DiscountCurve simpleCurve = new DiscountCurveSimpleInterest(0.05);
        DiscountCurve compoundCurve = new DiscountCurveCompoundInterest(0.05);

        Annuity rendita = new Annuity(cashFlows);
        
        double valBase = rendita.getValue(baseCurve);
        double valSimple = rendita.getValue(simpleCurve);
        double valCompound = rendita.getValue(compoundCurve);

        System.out.println("Nessuno sconto: " + valBase);
        System.out.println("Regime semplice: " + valSimple);
        System.out.println("Regime composto: " +  valCompound);
		
		
 		
 		
 	

	}

}
