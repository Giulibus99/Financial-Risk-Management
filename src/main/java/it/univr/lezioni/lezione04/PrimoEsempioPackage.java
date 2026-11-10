package it.univr.lezioni.lezione04;

import java.util.Random;

public class PrimoEsempioPackage {

	public static void main(String[] args) {
		
		/*
		 * Riga di codice legittima, ma non efficiente
		 */
		//java.util.Random rand = new java.util.Random();
		
		Random random = new Random();
		// Estraggo un numero random (double)
		System.out.println(random.nextDouble());
	}

}
