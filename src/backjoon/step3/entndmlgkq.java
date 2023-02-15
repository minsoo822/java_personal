package backjoon.step3;

import java.util.Scanner;

public class entndmlgkq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int sum = scanner.nextInt();
		scanner.close();
		int total = 0;
		
		for( int i = 1; i <= sum; i++ ) {
			total += i ; 
		}
				
		System.out.println(total);
	}

}
