package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Sim" : "Não");
	}

	private static boolean isAnagram(String valueA, String valueB) {
		if (valueA != null && valueB != null) {
			char[] a = valueA.toLowerCase().toCharArray();
			char[] b = valueB.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a, b);
		}
		return false;
	}
}
