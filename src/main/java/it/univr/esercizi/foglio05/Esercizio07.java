package it.univr.esercizi.foglio05;

public class Esercizio07 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		System.out.println("Numero atteso di decessi: " + table.getExpectedDeaths(65, 5, 10000));

	}

}
