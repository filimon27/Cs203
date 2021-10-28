package myutil;

public class BookMain {

	public static void main(String[] args) {
		BookCategory bookCategory= new BookCategory("kids","engineering","story");
		
		BookStore book= new BookStore("456",bookCategory,"McGrewHill","introduction to EMf","MEGA",45,120);
	
		book.trackSalesStatus();
	
		
	}
}
