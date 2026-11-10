package it.univr.esercizi.foglio05;

public class Esercizio10 {

	public static void main(String[] args) {
		PureEndowment valoreAttuariale = new PureEndowment(65, 10000, 5);
		MortalityTable table = new MortalityTable();
		
		System.out.println("Il valore attuariale è: " + valoreAttuariale.getValue(table, 0.02));

	}

}
