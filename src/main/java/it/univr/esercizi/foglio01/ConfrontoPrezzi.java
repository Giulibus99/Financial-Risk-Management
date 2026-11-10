package it.univr.esercizi.foglio01;

// Esercizio 11

public class ConfrontoPrezzi {

	public static void main(String[] args) {
		int prezzoTitoloA = 12;
		int prezzoTitoloB = 20;
		
		boolean uguale = (prezzoTitoloA == prezzoTitoloB);
		boolean magUguale = (prezzoTitoloA >= prezzoTitoloB);
		boolean maggiore = (prezzoTitoloA > prezzoTitoloB);
		boolean minUguale = (prezzoTitoloA <= prezzoTitoloB);
		boolean minore = (prezzoTitoloA < prezzoTitoloB);
		boolean diverso = (prezzoTitoloA != prezzoTitoloB);
		
		System.out.println("A e B uguali: " + uguale);
		System.out.println("A maggiore o uguale a B: " + magUguale);
		System.out.println("A maggiore di B: " + maggiore);
		System.out.println("A minore o uguale a B: " + minUguale);
		System.out.println("A miniore di B: " + minore);
		System.out.println("A e B diversi: " + diverso);

	}

}
