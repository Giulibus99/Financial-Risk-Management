package it.univr.esercizi.foglio05;


public class Esercizio29 {

	public static void main(String[] args) {
		GovernmentBond govBond = new GovernmentBond(4.0, "Italy");
		
		System.out.println("La scadenza è: " + govBond.getMaturity());
		System.out.println("La nazione è: " + govBond.getCountry());
	}

}
