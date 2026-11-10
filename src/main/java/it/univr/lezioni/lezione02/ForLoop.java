package it.univr.lezioni.lezione02;

public class ForLoop {

	public static void main(String[] args) {
		int somma = 0;
		int limite = 10;
		
		for (int i = 1; i <= limite; i++) { 
			// Incremento di i avviene alla conclusione dell'istruzione
			somma += i; 
			System.out.println("Somma: " + somma + " al punto " + i);
			// Qui viene aumentato i
		}
		System.out.println("Somma: " + somma);
		
		
		// Rendita finanziaria
		somma = 0;
		double rata = 100.0;
		double tassoDelta = 0.04;
		int anni = 100;
		
		for (int i = 1; i <= anni; i++) {
			double valoreAttualeRataIesima = rata * Math.exp(-tassoDelta * i);
			System.out.println("Il valore attuale della rata " 
			+ i + " è " + valoreAttualeRataIesima);
			somma += valoreAttualeRataIesima;
		}
		System.out.println("Il valore attuale è: " + somma);
		
		double target = 10000;
		boolean sonoSoddisfatto = (somma > target);
		
		if (sonoSoddisfatto) {
			System.out.println("Sono soddisfatto");
		}
		else {
			System.out.println("Non sono soddisfatto");
		}
		
	}

}
