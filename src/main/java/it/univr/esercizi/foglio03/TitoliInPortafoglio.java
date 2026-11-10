package it.univr.esercizi.foglio03;

/*
 * Esercizio 19 
 */

public class TitoliInPortafoglio {
	
	private int quantita;
	private double prezzoUnitario;
	
	
	private void configura (int quantita, double prezzo) {
		this.quantita = quantita;
		this.prezzoUnitario = prezzo;
		
	}
	
	private double calcolaValore() {
		return this.quantita * this.prezzoUnitario;
	}

	public static void main(String[] args) {
		int length = 3;
		TitoliInPortafoglio[] portafoglio = new TitoliInPortafoglio[length];
		TitoliInPortafoglio titolo1 = new TitoliInPortafoglio();
		TitoliInPortafoglio titolo2 = new TitoliInPortafoglio();
		TitoliInPortafoglio titolo3 = new TitoliInPortafoglio();
		portafoglio[0] = titolo1;
		portafoglio[1] = titolo2;
		portafoglio[2] = titolo3;
		
		titolo1.configura(2, 100.0);
		titolo2.configura(3, 50.0);
		titolo3.configura(5, 20.0);
		//portafoglio[2].configura(5, 20.0);
		
		double somma = 0.0;
		
		for (int i = 0; i < length; i++) {
			somma += portafoglio[i].calcolaValore();
		}
		
		System.out.println("Il valore del portafoglio é: " + somma);

	}

}
