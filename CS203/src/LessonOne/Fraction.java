package LessonOne;

public class Fraction {

	double x;
	double y;
	double z = x / y;
	private Object frac;

	public Fraction(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static double compareToFraction(Fraction f1, Fraction f2) {
		if (f1.z == (f2.z))
			return 0;
		else if (f1.z > f2.z)
			return 1.0;
		else
			return -1.0;
	}
	public int compareTo(Fraction frac) {
		return this.compareTo(frac);
		}
	

	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(5.5, 2.5);
		Fraction f2 = new Fraction(10.5, 3);
		System.out.println(compareToFraction(f1, f2));
		
		
		
	f1.compareTo(f2);
   System.out.println(f1.compareTo(f2));
	}
}
	

