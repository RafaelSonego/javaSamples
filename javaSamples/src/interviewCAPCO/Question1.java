package interviewCAPCO;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(subtract(list1, list2));
	}
	
	static List<Integer> subtract(List<Integer> list1, List<Integer> list2){
		List<Integer> listReturn = new ArrayList<>(list1);
		listReturn.removeAll(list2);
		return listReturn;	
	}

}
