package it.univr.esercizi.foglio03;

/*
 * Esercizio7
 */

public class CedolePluriennali {

	private double valoreNominale;
	private double tassoAnnuale;
	private int anni;
	
	public void configura(double valore, double tasso, int anni) {
		this.valoreNominale = valore;
		this.tassoAnnuale = tasso;
		this.anni = anni;
	}
	
	public double sommaCedole() {
		double cedola = valoreNominale * tassoAnnuale;
		double totaleCedole = 0.0;
		for (int i = 0; i < this.anni; i++) {
			totaleCedole += cedola;
		}
		return totaleCedole;
	}
	
	public static void main(String[] args) {
		CedolePluriennali titolo1 = new CedolePluriennali();
		titolo1.configura(5000.0, 0.04, 4);
		System.out.println("Il totale delle cedole ricevuto è: " + titolo1.sommaCedole());
	}

}
