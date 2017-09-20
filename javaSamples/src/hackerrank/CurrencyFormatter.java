package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat currencyIndia = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + currencyUS.format(payment));
		System.out.println("India: " + currencyIndia.format(payment));
		System.out.println("China: " + currencyChina.format(payment));
		System.out.println("France: " + currencyFrance.format(payment));
	}
}
