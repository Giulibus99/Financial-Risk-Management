package it.univr.esercizi.foglio05;

public class Esercizio05 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		System.out.println("Probabilità di decesso: " + table.getDeathInYear(65, 3));
	}

}
