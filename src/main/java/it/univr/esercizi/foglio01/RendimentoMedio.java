package it.univr.esercizi.foglio01;

// Esercizio 8

public class RendimentoMedio {

	public static void main(String[] args) {
		double primoRend = 0.025;
		double secondoRend = -0.010;
		double terzoRend = 0.040;
		
		double rendMedio = (primoRend+secondoRend+terzoRend)/3;
		
		// confronto
		double obiettivo = 0.015;
		boolean rendimentoSopraObiettivo = rendMedio >= obiettivo;
		
		System.out.println("Il rendimento medio e': " + rendMedio);
		System.out.println("Il rendimento medio e' sopra la soglia? " + rendimentoSopraObiettivo);

	}

}
