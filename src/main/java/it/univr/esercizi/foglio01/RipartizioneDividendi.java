package it.univr.esercizi.foglio01;

// Esercizio 3

public class RipartizioneDividendi {

	public static void main(String[] args) {
		int dividendiCentesimi = 5353;
		int numeroAzionisti = 8;
		
		// Nuove variabili con i risultati
		int centesimiAzionista = dividendiCentesimi / numeroAzionisti;
		int rimanenza = dividendiCentesimi % numeroAzionisti;
		
		System.out.println("Ogni azionista riceve: " + centesimiAzionista + " centesimi");
		System.out.println("Dopo la distribuzione rimangono: " + rimanenza + " centesimi");

	}

}
