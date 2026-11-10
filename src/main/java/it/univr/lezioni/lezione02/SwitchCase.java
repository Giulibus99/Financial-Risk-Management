package it.univr.lezioni.lezione02;

public class SwitchCase {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = b + a;
		
		
		switch (a) {
		case 1: {
			System.out.println(1);
		}
		case 3: {
			System.out.println(3);
		}
		default:
			System.out.println("Default"); // Senza nessun break questo viene sempre eseguito
		}
		
		System.out.println();
		
		switch (c) {
		case 1: {
			System.out.println(1);
		}
		case 3: {
			System.out.println(3);
			break;
		}
		default:
			System.out.println("Default");
		}
		
	}

}
