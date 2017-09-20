package inforTest.question6;

public class Teste {
	public static void main(String[] args) {
	}

	public boolean areReflected(Node tree1, Node tree2) {
		boolean valueEqual = false;
		boolean leftEqual = false;
		boolean rightEqual = false;

		if (tree1 != null && tree2 != null) {
			
			valueEqual = tree1.getValue().equals(tree2.getValue());

			if (tree1.getLeftChild() != null && tree2.getRightChild() != null) {
				leftEqual = areReflected(tree1.getLeftChild(), tree2.getRightChild());
			} else if (tree1.getLeftChild() == null && tree2.getRightChild() == null) {
				leftEqual = true;
			}

			if (tree1.getRightChild() != null && tree2.getLeftChild() != null) {
				rightEqual = areReflected(tree1.getRightChild(), tree2.getLeftChild());
			} else if (tree1.getRightChild() == null && tree2.getLeftChild() == null) {
				rightEqual = true;
			}

			return (valueEqual && leftEqual && rightEqual);
		}
		return false;
	}

}
