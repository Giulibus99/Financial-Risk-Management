package it.univr.lezioni.lezione02;

public class IncrementiDecrementi {

	public static void main(String[] args) {
		// Incrementi e decrementi
		int firstTestVariable = 5;
		int secondTestVariable = 5;
		System.out.println("first test variable: " + firstTestVariable);
		System.out.println("second test variable: " + secondTestVariable);
				
		System.out.println();
		
				
		// un operatore può cambiare il valore di un operando
		System.out.println("++firstTestVariable: " + ++firstTestVariable); // prima incremento poi stampo
		System.out.println("--secondTestVariable: " + --secondTestVariable); // prima decremento poi stampo 

		System.out.println();
		
		// firstTestVariable e secondTestVariable sono ora uguali a 6 e 4
		System.out.println("firstTestVariable++: " + firstTestVariable++); // prima stampo poi incremento
		System.out.println("secondTestVariable--: " + secondTestVariable--); // prima stampo poi decremento

		
		System.out.println();
				
		// Cos'è successo adesso?
		System.out.println("firstTestVariable: " + firstTestVariable);
		System.out.println("secondTestVariable: " + secondTestVariable);
		
		System.out.println();
		
		int a = 5;
		System.out.println(a);
		double b = (a);
		System.out.println(b);
		
		
		System.out.println(3/2); // divisione tra interi
		System.out.println(3.0/2); // divisione tra un double e un int il risultato sarà un double
		
	}

}
