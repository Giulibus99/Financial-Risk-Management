package it.univr.esercizi.foglio01;

// Esercizio 10

public class OrdiniAperti {

	public static void main(String[] args) {
		int ordiniAperti = 5;
		
		System.out.println("Ordini aperti " + ++ordiniAperti); // viene mostrato 6
		System.out.println("Ordini aperti " + ordiniAperti++); // viene mostrato 6, ma si modifica la variabile a 7
		System.out.println("Valore corrente " + ordiniAperti); // viene mostrato 7
		System.out.println("Ordini aperti " + --ordiniAperti); // viene mostrato 6
		System.out.println("Ordini aperti " + ordiniAperti--); // viene mostrato 6, ma si modifica la variabile a 5
		System.out.println("Valore finale " + ordiniAperti); // viene mostrato 5
	}

}
