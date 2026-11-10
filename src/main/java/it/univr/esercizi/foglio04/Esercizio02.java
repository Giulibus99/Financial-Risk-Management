package it.univr.esercizi.foglio04;

/*
 * Esercizio 2: DepositoVincolato main
 */

public class Esercizio02 {

	public static void main(String[] args) {
		DepositoVincolato deposito1 = new DepositoVincolato(2000.0);
		DepositoVincolato deposito2 = new DepositoVincolato(2000.0, 0.04);
		
		System.out.println("L'interesse del deposito 1 è: " + deposito1.interesseAnnuo());
		System.out.println("L'interesse del deposito 2 è: " + deposito2.interesseAnnuo());
	}
}
