package it.univr.esercizi.foglio05;

public class Esercizio14 {

	public static void main(String[] args) {
		LifeAnnuity renditaPosticipata = new LifeAnnuity(65, 1000.0, 5);
		LifeAnnuity renditaAnticipata = new LifeAnnuity(65, 1000.0, 5, true);
		MortalityTable table = new MortalityTable();
		
		System.out.println("La rendita posticipata: " + renditaPosticipata.getValue(table, 0.02));
		System.out.println("La rendita anticipata: " + renditaAnticipata.getValue(table, 0.02));

	}

}
