package it.univr.lezioni.lezione02;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		
		Scanner inputGiver = new Scanner(System.in);

        System.out.print("Insert 0 or 1 ");

        int givenNumber = inputGiver.nextInt();
        
        switch (givenNumber) {
		case 0:
			System.out.print("You inserted 0");
			break;
		case 1:
			System.out.print("You inserted 1");
			break;
		default:
			System.out.print("You inserted a no valid number");
			break;
		}
		

	}

}
