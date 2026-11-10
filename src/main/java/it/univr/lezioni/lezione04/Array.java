package it.univr.lezioni.lezione04;

public class Array {

	public static void main(String[] args) {
		int lunghezza = 8;
		
		double[] myArray = new double[lunghezza];
		
		for (int i = 0; i < lunghezza; i++) {
			double nuovoNumero = Math.pow(2, i);
			myArray[i] = nuovoNumero;
		}
		
		for (int i = 0; i < lunghezza; i++) {
			System.out.println("Numero " +  i + ": " + myArray[i]);
		}
	}

}
