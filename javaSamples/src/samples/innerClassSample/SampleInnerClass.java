package samples.innerClassSample;

class Outer_Demo {
	   // private variable of the outer class
	   private int num = 175;  
	   
	   // inner class
	   public class Inner_Demo {
	      public int getNum() {
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	   }
	}

public class SampleInnerClass {

	public static void main(String[] args) {
		Outer_Demo outer = new Outer_Demo();
		Outer_Demo.Inner_Demo inner_Demo = outer.new Inner_Demo();
		inner_Demo.getNum();
	}
}
