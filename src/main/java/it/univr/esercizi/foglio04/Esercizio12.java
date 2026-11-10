package it.univr.esercizi.foglio04;

public class Esercizio12 {

	public static void main(String[] args) {
		double zeroCoupon = MyAnalyticFormulas.prezzoZeroCoupon(1102.05, 0.05, 2);
		
		System.out.println("Il prezzo zero coupon è: " + zeroCoupon);

	}

}
