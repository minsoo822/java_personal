package backjoon.step2;

import java.util.Scanner;

public class dbssus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = scanner.nextInt();
		scanner.close();
		
		if ( sum%4 == 0  ) {
			if ( sum%400 == 0 ) {
				System.out.println("1");
			} else if (sum%100 ==0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		
		} else {
			System.out.println("0");
		}
	}

}
