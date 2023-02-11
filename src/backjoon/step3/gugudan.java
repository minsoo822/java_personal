package backjoon.step3;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = scanner.nextInt();
		
		for(int i = 1; i<=9; i++) {
			
			System.out.println(sum + " * " + i + " = " + sum*i);
		}

	}

}
