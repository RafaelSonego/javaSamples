package dataStructures.vector;

public class VectorTest {

	public static void main(String[] args) {
		Student a1 = new Student("Andre");
		Student a2 = new Student("Beatriz");
		Student a3 = new Student("Rafael");
		Student a4 = new Student("Jessica");
		Student a5 = new Student("Maria");

		Vector list = new Vector();
		list.add(a1);
		list.add(a2);
		list.add(a4);
		list.add(a5);

		System.out.println(list);

		list.add(1, a3);
		System.out.println(list);

		for (int i = 0; i < 300; i++) {
			Student y = new Student("Rafael" + i);
			list.add(y);
		}
		System.out.println(list);

		list.remove(1);

		System.out.println(list);

	}

}
