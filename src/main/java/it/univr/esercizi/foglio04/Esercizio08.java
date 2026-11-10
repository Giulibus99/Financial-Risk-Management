package it.univr.esercizi.foglio04;

import it.univr.esercizi.foglio04.modelli.SogliaMercato;

public class Esercizio08 {

	public static void main(String[] args) {
		SogliaMercato soglia = new SogliaMercato(120);
		
		System.out.println("Il prezzo è amissibile? " + soglia.prezzoAmissibile(118.0));
		System.out.println("Il prezzo è amissibile? " + soglia.prezzoAmissibile(125.0));
		

	}

}
