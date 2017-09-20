package interviewEnghouse;

public class ExceptionTest {

	public static void main(String[] args) {
		int num = method1();
		System.out.println(num);
	}

	public static int method1() {
		try {
			method2();
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		} finally {
			System.out.println("finally");
		}
		return 0;
	}

	public static void method2() {
		throw new NumberFormatException();
	}

}
