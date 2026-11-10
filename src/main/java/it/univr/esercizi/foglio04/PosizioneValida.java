package it.univr.esercizi.foglio04;

/*
 * Esercizio 6 – PosizioneValida 
 */

public class PosizioneValida {

	private int quantita;
	private double prezzo;
	
	/*
	 * Costruttore private e quindi non è possibile richiamarlo da un'altra classe
	 */
	private PosizioneValida(int quantita, double prezzo) {
		this.quantita = quantita;
		this.prezzo = prezzo;
	}
	
	/*
	 * Grazie a questo metodo "crea" accedo al costruttore,
	 * dato che non posso farlo direttamente dalla classe dove ho il main
	 */
	public static PosizioneValida crea(int quantita, double prezzo) {
		if(quantita > 0 && prezzo > 0) {
			return new PosizioneValida(quantita, prezzo);
		}
		else {
			// Se l'if non viene soddisfatta l'istanza non viene creata
			return null;
		}
	}
	public double valore() {
		return this.quantita * this.prezzo;
	}
}
