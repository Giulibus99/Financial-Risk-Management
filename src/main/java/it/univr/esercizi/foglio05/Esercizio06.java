package it.univr.esercizi.foglio05;

public class Esercizio06 {

	public static void main(String[] args) {
		MortalityTable table = new MortalityTable();
		
		int age = 65;
		int years = 5;
		
		System.out.println("La probabilità di morire entro n anni: " + table.getDeathWithin(age, years));
		
		double prob01 = table.getDeathWithin(65, 5);
		double prob02 = 0.0;
		for (int i = 1; i <= years; i++) {
			prob02 += table.getDeathInYear(age, i);
		}
		
		if(prob01 == prob02) {
			System.out.println("Corretto");
		}
		else {
			System.out.println("Attenzione: " + prob01 + ", " + prob02);
		}
		
		
		
	}

}
