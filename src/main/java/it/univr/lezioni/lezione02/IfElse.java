package it.univr.lezioni.lezione02;

public class IfElse {

	public static void main(String[] args) {
		int a = 2;
		int b = 11;
		
		if (a < b) {
			System.out.println("Siamo nell'if");
		}
		else {
			System.out.println("Siamo nell'else");
		}
		if (b % 2 == 0) {
			System.out.println("Non c'è resto");
		}
		else {
			System.out.println("C'è resto");
		}

	}

}
