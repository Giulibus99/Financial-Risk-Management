package it.univr.lezioni.lezione02;

public class WhileLoop {

	public static void main(String[] args) {
		int variabile = 1;
		
		while (variabile <= 5) {
			System.out.println(variabile++);
			
			if (variabile == 3) {
				System.out.println("Ha appena stampato 2, "
						+ "e il valore di variabile è: " + variabile);
			}
			
		}
		
	}

}
