package it.univr.esercizi.foglio01;

// Esercizio 5

public class InteresseSemplice {

	public static void main(String[] args) {
		double capitaleIniziale = 7500.0;
		double tassoAnnuo = 0.035; // 3.5% annuo
		double anni = 3.0;
		
		/* Interesse semplice: I = C*r*t
		* Il tempo t è un fattore moltiplicativo
		* 
		* Montante: M = C+I
		*/
		
		double interesseSemplice = capitaleIniziale * tassoAnnuo * anni;
		double montante = capitaleIniziale + interesseSemplice;
		
		System.out.println("Capitale iniziale = " + capitaleIniziale );
		System.out.println("Interesse semplice = " + interesseSemplice);
		System.out.println("Montante = " + montante);
	}

}
