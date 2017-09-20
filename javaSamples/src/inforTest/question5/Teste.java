package inforTest.question5;

import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Teste t = new Teste();
		String[] arraya = new String[]{null, "rafael", ""};
		String[] arrayb = new String[]{"rafael", "", "teste"};
		
		System.out.println(t.isInBoth(null, arraya, arrayb));
	}

	public boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
		try{
			if(arrayA == null || arrayB == null){
				throw new RuntimeException("Arrays not be null");
			}
			List<String> firstArray = Arrays.asList(arrayA);
			List<String> secondArray = Arrays.asList(arrayB);
			
			return firstArray.contains(value) && secondArray.contains(value);
			
		}catch (Exception x){
			throw new RuntimeException("Error! =/");
		}
	}
	
	
    public boolean isInBothTest(String value, String[] arrayA, String[] arrayB) {
        boolean found = false;

        try {
            for (int a = 0; a <= arrayA.length; a++) {
                for (int b = arrayB.length - 1; b > 0; b--) {
                    if (arrayA[a].equals(arrayB[b])) {
                        throw new Exception("Found!");
                    }
                }
            }
        } catch (Exception e) {
            if ("Found!".equals(e.getMessage())) {
                found = true;
            }
        }

        return found;
    }
	
	
}
