package myutil;
import java.util.Scanner;

public class BookStore {
	private BookCategory bookCategory;
	private String author; 
	private String title;
	private String publisher;
	private int bookPrice;
	private int quantity;
	
	public BookStore(String storeId,BookCategory bookCategory, String author,String title,String publisher,int bookPrice,int quantity) {
	       
		this.bookCategory=bookCategory;
		this.author=author;
		this.title=title;
		this.publisher=publisher;
		this.bookPrice=bookPrice;
		this.quantity=quantity;
		
	}
	
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
public   void trackSalesStatus() {
	      Scanner input= new Scanner(System.in);
		System.out.println("enter how many books you want to buy");
      
		int sale= input.nextInt();
		
				System.out.println("the number of books sold are " + sale);
				
				quantity= quantity-sale;
				System.out.println("the available quantity is" + quantity);
		
	}
     
	
}
