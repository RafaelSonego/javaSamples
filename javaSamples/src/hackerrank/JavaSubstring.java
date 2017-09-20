package hackerrank;

import java.util.Scanner;

public class JavaSubstring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		in.close();
		int size = S.length();

		if ((size >= 1 && size <= 100) && (start >= 0 && start < end)) {
			System.out.println(S.substring(start, end - 1));
		}
	}

}
