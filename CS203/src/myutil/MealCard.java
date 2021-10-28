package myutil;

public class MealCard {

	private int pointBalance = 100;
	

	
	public MealCard(int pointBalance) {
		
		this.pointBalance=pointBalance;
		
	}
	public void purchase(int itemPrice) {

		if (pointBalance > itemPrice) {
			pointBalance = pointBalance - itemPrice;

			System.out.println("the point after purchase  is " + pointBalance);
		} else
			System.out.println("you can not purchase");
	}

	public int point(int purchasePoint) {
		return pointBalance += purchasePoint;
	}
}
