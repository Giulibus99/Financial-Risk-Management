package it.univr.esercizi.foglio05;

public class Esercizio11 {

	public static void main(String[] args) {
		TermLifeInsurance insurance = new TermLifeInsurance(65, 10000.0 ,5);
		MortalityTable table = new MortalityTable();
		
		System.out.println("Il pagamento è: " + insurance.getValue(table, 0.02));
		System.out.println("Il pagamento è: " + insurance.getValue(table, 0.03));
		
		MortalityTable updateTable = new MortalityTable(65, 69);
		System.out.println("Il pagamento è: " + insurance.getValue(updateTable, 0.02));
	
	}

}
