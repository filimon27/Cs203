package LessonOne;
import myutil.MealCard;
public class TestMealCard {
	public static void main(String[] args) {
		MealCard student1= new MealCard(200);
		student1.purchase(35);
		
		System.out.println(student1.point(100));
		
		
	}

}
