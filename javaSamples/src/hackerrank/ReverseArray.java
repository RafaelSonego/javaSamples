package hackerrank;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		in.close();
		int newArray[] = new int[n];

		for (int j = 0, i = arr.length - 1; i >= 0; i--, j++) {
			newArray[j] = arr[i];
		}
	}

}
