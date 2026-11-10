package it.univr.esercizi.foglio04.modelli;

/*
 * Esercizio 8 – Import da un package diverso
Crea una classe pubblica SogliaMercato nel package sheet4.modelli, con campo private double
limite, costruttore pubblico e due metodi: boolean verificaInterna(double prezzo) senza mo-
dificatorediaccesso, checontrollaprezzo ≤ limite, epublic boolean prezzoAmmissibile(double
prezzo) che chiama il metodo precedente. Nel main della classe sheet4.Esercizio08, importa
sheet4.modelli.SogliaMercato, imposta la soglia a 120 e controlla i prezzi 118 e 125. Indica in
un commento perché verificaInterna non è accessibile da sheet4.
 */

public class SogliaMercato {

	private double limite;
	
	public SogliaMercato(double limite) {
		this.limite = limite;
	}
	
	boolean verificaInterna(double prezzo) {
		return prezzo <= this.limite;
	}
	
	public boolean prezzoAmissibile(double prezzo) {
		return verificaInterna(prezzo);
	}
}
