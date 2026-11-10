package it.univr.esercizi.foglio05;

public class CorporateBond extends FinancialProduct {
	
	private String issuer;
	
	CorporateBond(double maturity, String issuer) {
		super(maturity);
		this.issuer = issuer;
	}
	
	String getIssuer() {
		return this.issuer;
	}

}
