package inforTest.question3;

public class Teste {

	public static void main(String[] args) {
		Teste teste = new Teste();
		System.out.println(teste.checkValues(1, 1, 3));
		System.out.println(teste.checkValues2(1, 1, 3));
		System.out.println();
		
		System.out.println(teste.checkValues(1, 2, 2));
		System.out.println(teste.checkValues2(1, 2, 2));
		System.out.println();
		
		System.out.println(teste.checkValues(1, 1, 1));
		System.out.println(teste.checkValues2(1, 1, 1));
		System.out.println();
		
		System.out.println(teste.checkValues(10, 10, 11));
		System.out.println(teste.checkValues2(10, 10, 11));
		System.out.println();
		
		System.out.println(teste.checkValues(2, 1, 1));
		System.out.println(teste.checkValues2(2, 1, 1));
		System.out.println();
		
		System.out.println(teste.checkValues(1, 2, 1));
		System.out.println(teste.checkValues2(1, 2, 1));
		

	}

	public boolean checkValues(int valOne, int valTwo, int valTree) {

		boolean firstCondition = valOne < multiplication(valOne, valTree); // ever true
		boolean secondCondition = valTwo < valTree;
		boolean thirdCondition = valOne < multiplication(valOne, valTree); // the same first condition ever true
		boolean fourthCondition = valTwo > valTree;
		boolean fifthCondition = valTree < valTwo;
		
		if (secondCondition) {
			return true;
		}
		return false;
	}
	
	public int multiplication(int firstNumber, int secondNumber) {
		int result = 0;
		for (int i = 0; i < secondNumber; i++) {
			result += firstNumber;
		}
		return result;
	}
	
	
    public boolean checkValues2(int x, int y, int z) {
        if (x < u(x, z) && y < z || x < u(x, z) && y > z && z < y) {
            return true;
        }
        return false;
    }

    private int u(int x, int z) {
        int f = 0;
        for (int i = 0; i < z; i++) {
            f += x;
        }
        return f;
    }

}
