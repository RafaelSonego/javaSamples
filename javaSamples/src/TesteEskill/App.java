package TesteEskill;

import java.util.ArrayList;
import java.util.List;

public class App {

//	public static void main(String... args) throws InterruptedException {
//		final AtomicInteger ai = new AtomicInteger();
//		final List<Integer> ints = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			ints.add(i);
//		}
//		class ArrayReader implements Runnable {
//
//			@Override
//			public void run() {
//				for (Iterator<Integer> it = ints.iterator(); it.hasNext();) {
//					ai.addAndGet(it.next());
//				}
//
//			}
//		}
//		
//		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		executorService.execute(new ArrayReader());
//		executorService.execute(new ArrayReader());
//		executorService.shutdown();
//		executorService.awaitTermination(1, TimeUnit.MINUTES);
//		System.out.println(ai);
//	}
	
//	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("()");
//		Matcher matcher = pattern.matcher("abc");
//		while(matcher.find()){
//			String s = matcher.group();
//			System.out.println(s);
//		}
//	}

//	public static void main(String[] args) {
//		Set<Date> set = new HashSet<>();
//		Date date = new Date(1000);
//		set.add(date);
////		date.setTime(date.getTime() + 1);
//		Iterator<Date> iterator = set.iterator();
//		System.out.println(iterator.hasNext());
//		System.out.println(set.size());
//		System.out.println(set.contains(date));
//		set.remove(date);
//		set.clear();
//		
//		List<String> list = 
//		
//	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("R");
		list.addAll(new ArrayList<>());
	}
	
}
