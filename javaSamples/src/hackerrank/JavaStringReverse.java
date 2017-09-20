package hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();

		StringBuilder reverseString = new StringBuilder(A);
		reverseString = reverseString.reverse();
		if (A.equals(reverseString.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
