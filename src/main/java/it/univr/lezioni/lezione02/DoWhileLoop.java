package it.univr.lezioni.lezione02;

public class DoWhileLoop {

	public static void main(String[] args) {
		int var = 10;
		
		do {
			System.out.println(var);
		} while (var < 5);

		System.out.println();
		var = 1;
		do {
			System.out.println(var++);
		} while (var <= 5);
		
		while (var <= 6) {
			System.out.println("Sono nel while");
			var++;
		}
	}

}
