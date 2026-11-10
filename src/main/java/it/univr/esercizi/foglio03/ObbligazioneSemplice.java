package it.univr.esercizi.foglio03;

/*
 * Esercizio 03 
 */


public class ObbligazioneSemplice {

	private double valoreNominale;
	private double tassoCedolare;
	
	public void configura(double valoreNominale, double tassoCedolare) {
		this.valoreNominale = valoreNominale;
		this.tassoCedolare = tassoCedolare;
	}
	
	public double calcolaCedola(){
		return valoreNominale * tassoCedolare;
	}
	
	public static void main(String[] args) {
		ObbligazioneSemplice obbligazione01 = new ObbligazioneSemplice();
		obbligazione01.configura(2000, 0.035);
		double cedola01 = obbligazione01.calcolaCedola();
		System.out.println("La cedola è: " + cedola01 + " euro");	
	}

}
