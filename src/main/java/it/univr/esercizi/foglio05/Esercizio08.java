package it.univr.esercizi.foglio05;

public class Esercizio08 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		System.out.println("La durata residua futura è: " + table.getCurtateLifetime(65, 20));
	}

}
