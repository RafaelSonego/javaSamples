package inforTest.question2;

import java.util.ArrayList;
import java.util.Collection;

public class TesteCollection {

	public static void main(String[] args) {
		new TesteCollection().fragment1();
	}

	public void fragment1() {
		Collection<Character> s = getCollection();
		for (Character CharA : s) {
			System.out.println(CharA);
		}
		for (Character CharA : s) {
			System.out.println(CharA + CharA);
		}
		for (Character CharA : s) {
			System.out.println(CharA + CharA + CharA);
		}
		for (Character CharA : s) {
			System.out.println(CharA + CharA + CharA + CharA);
		}
		for (Character CharA : s) {
			System.out.println(CharA + CharA + CharA + CharA + CharA);
		}
	}

	public void fragment2() {
		Collection<Character> s = getCollection();
		for (Character CharA : s) {
			for (Character CharB : s) {
				for (Character CharC : s) {
					System.out.println(CharA + CharB + CharC);
				}
			}
		}
	}

	private static Collection<Character> getCollection() {
		Collection<Character> c = new ArrayList<>();
		c.add('b');
		c.add('o');
		c.add('m');
		c.add('b');
		c.add('l');
		return c;

	}

}
