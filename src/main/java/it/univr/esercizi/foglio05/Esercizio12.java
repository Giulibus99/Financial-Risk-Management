package it.univr.esercizi.foglio05;

public class Esercizio12 {

	public static void main(String[] args) {
		EndowmentInsurance polizzaMista = new EndowmentInsurance(65, 10000.0, 5);
		MortalityTable table = new MortalityTable();
		
		System.out.println("Il valore della polizza mista: " + 
				polizzaMista.getValue(table, 0.02));

	}

}
