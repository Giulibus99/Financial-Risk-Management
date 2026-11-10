package it.univr.esercizi.foglio03;

/*
 * Esercizio 20 – Portafoglio completo: oggetti, array e decisioni
Crea la classe PortafoglioCompleto con attributi private int quantita e private double
prezzoUnitario; implementa configura(int, double) e calcolaValore(). Nel main, crea un
array di tre oggetti distinti della classe, con coppie (quantità, prezzo) pari a (2, 125.5), (4, 75.25)
e (10, 18.75). Con un ciclo for somma il valore delle posizioni e conta quelle con valore almeno
200 euro. Confronta il totale con l’obiettivo di 730 euro tramite if-else; usa anche il ternario per
assegnare ’S’ o ’N’ a un char. Stampa totale (739.5 euro), contatore (2), esito e totale convertito
esplicitamente a int (739).
 */

public class PortafoglioCompleto {

	private int quantita;
	private double prezzoUnitario;
	
	/*
	 * Al posto del metodo configura si potrebbe creare direttamente il costruttore
	 * 
	 * private PortafoglioCompleto(int quantita, double prezzo) {
	 * this.quantita = quantita;
	 * this.prezzoUnitario = prezzo;
	 * }
	 */

	
	private void configura(int quantita, double prezzo) {
		this.quantita = quantita;
		this.prezzoUnitario = prezzo;
	}
	
	private double calcolaValore() {
		return this.quantita * this.prezzoUnitario;
	}
	
	public static void main(String[] args) {
		int length = 3;
		PortafoglioCompleto[] portafoglio = new PortafoglioCompleto[length];
		PortafoglioCompleto titolo1 = new PortafoglioCompleto();
		PortafoglioCompleto titolo2 = new PortafoglioCompleto();
		PortafoglioCompleto titolo3 = new PortafoglioCompleto();
		
		titolo1.configura(2,  125.5);
		titolo2.configura(4,  75.25);
		titolo3.configura(10, 18.75);
		
		portafoglio[0] = titolo1;
		portafoglio[1] = titolo2;
		portafoglio[2] = titolo3;
		
		int almenoDuecento = 0;
		double somma = 0.0;
		
		for (int i = 0; i < length; i++) {
			somma += portafoglio[i].calcolaValore();
			if (portafoglio[i].calcolaValore() >= 200) {
				almenoDuecento++;
			}
		}
		
		double obiettivo = 730.0;
		
		if (somma >= obiettivo) {
			System.out.println("Il totale è superiore o pari all'obiettivo");
		} else {
			System.out.println("Il totale è inferiore all'obiettivo");
		}
		
		char obiettivoRaggiunto = (somma >= obiettivo) ? 'S': 'N';
		
		System.out.println("Il totale è " + somma);
		System.out.println("Ci sono " + almenoDuecento + 
				" titoli che valgono almeno duecento euro");
		System.out.println("Esito confronto (S sopra obiettivo, N sotto obbiettivo): " 
				+ obiettivoRaggiunto);
		
		int sommaIntera = (int)somma;
		System.out.println("Il totale covertito in interi è " + sommaIntera);
	}

}
