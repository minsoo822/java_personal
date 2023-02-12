package backjoon.step2;

import java.util.Scanner;

public class tlgjatjdwjr {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = scanner.nextInt();
		
		if ( sum >=90 ) {
			System.out.println("A");
		} else if (sum >= 80) {
			System.out.println("B");
		} else if ( sum >=70 ) {
			System.out.println("C");
		} else if (sum >= 60 ) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
