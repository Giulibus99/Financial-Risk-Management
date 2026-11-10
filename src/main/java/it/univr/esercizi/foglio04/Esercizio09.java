package it.univr.esercizi.foglio04;

public class Esercizio09 {

	public static void main(String[] args) {
		SaldoCliente saldo1 = new SaldoCliente(100.0);
		SaldoCliente saldo2 = saldo1;
		SaldoCliente saldo3 = new SaldoCliente(100.0);

		saldo2.deposita(25.0);
		
		System.out.println("I tre saldi sono: " + saldo1.leggiSaldo() + ", " 
				+ saldo2.leggiSaldo() + ", " + saldo3.leggiSaldo());
		
		System.out.println("Il saldo1 è uguale al saldo2? " + (saldo1 == saldo2));
		System.out.println("Il saldo1 è uguale al saldo3? " + (saldo1 == saldo3));
		
	}

}
