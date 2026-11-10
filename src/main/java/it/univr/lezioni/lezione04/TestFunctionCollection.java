package it.univr.lezioni.lezione04;

public class TestFunctionCollection {

	public static void main(String[] args) {
		double result = FunctionsCollection.sum(1, 2);
		System.out.println("Il risultato è: " + result);
		
		// Anche la classe Math ha i metodi statici
		double mathResult = Math.addExact(1, 2);
		System.out.println("Il risultato è: " + mathResult);
		
	}

}
