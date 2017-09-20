package interviewEnghouse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String xpto = scanner.nextLine();
			String reverse = reverse(xpto);
			System.out.println(reverse);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static String reverse(String xpto) {
		StringBuilder sb = new StringBuilder();
		for (int i = xpto.length() - 1; i >= 0; i--) {
			sb.append(xpto.charAt(i));
		}
		return sb.toString();
	}

}
