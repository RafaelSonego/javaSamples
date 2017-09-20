package interviewCAPCO.food;


public class FoodFactory extends Food{
	
	public Food getFood(String food) {
		if ("FastFood".equals(food)) {
			return new FastFood();
		} else if ("Fruit".equals(food)) {
			return new Fruit();
		}
		throw new IllegalArgumentException("No food found with name " + food);
	}
}
