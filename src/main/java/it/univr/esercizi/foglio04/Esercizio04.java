package it.univr.esercizi.foglio04;

/*
 * Esercizio 4 – ContoTrading main
 */

public class Esercizio04 {

	public static void main(String[] args) {
		ContoTrading conto1 = new ContoTrading(1000);
		
		System.out.println("Esito prelievo: " + conto1.preleva(350));
		System.out.println("Esito prelievo: " + conto1.preleva(800));
		conto1.leggiSaldo();
	
		System.out.println();
		System.out.println("-----------");
		
		System.out.println("Usando il getter: " + conto1.getSaldo());
		conto1.setSaldo(1000.0);
		System.out.println("Usando il getter: " + conto1.getSaldo());
		
	}

}
