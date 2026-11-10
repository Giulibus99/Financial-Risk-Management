package it.univr.esercizi.foglio05;

public class CashFlow {
	
	double importo;
	double scadenza;
	
	
	// Costruttori
	// Sovrascritto il costruttore di default
	CashFlow() {
	}
	
	CashFlow (double amount){
		this.importo = amount;
	}
	
	CashFlow (double amount, double maturity){
		this(amount);
		this.scadenza = maturity;
	}
	
	// Metodi getter e setter
	double getImporto() {
		return importo;
	}
	
	void setImporto(double importo) {
		this.importo = importo;
	}

	double getScadenza() {
		return scadenza;
	}

	void setScadenza(double scadenza) {
		this.scadenza = scadenza;
	}

	double getValue(DiscountCurve curve) {
		return importo * curve.getValue(scadenza);
	}
	

}
