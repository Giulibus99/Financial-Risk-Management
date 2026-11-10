package it.univr.esercizi.foglio05;

public class GovernmentBond extends FinancialProduct {
	
	private String country;
	
	GovernmentBond(double maturity, String country) {
		super(maturity);
		this.country = country;
	}
	
	String getCountry() {
		return this.country;
	}

}
