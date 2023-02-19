package backjoon.step3;

import java.util.Scanner;

public class AplusBminus3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int T, A, B;
		
		T = scanner.nextInt();
		
		for (int i = 1; i <= T; i++) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}

	}

}
