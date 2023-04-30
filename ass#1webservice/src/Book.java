import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Book {
	private String bookId;
	private String auther;
	private String title;
	private String genre;
	private double price;
	private String Date;
	private String discreption;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookId, String auther, String title, String genre, double price, String date,String discreption) {
		this.bookId = bookId;
		this.auther = auther;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.Date=date;
		this.discreption = discreption;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getDiscreption() {
		return discreption;
	}

	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}
	

	public void printBook() {
		System.out.println("|-----------------------------------------------------------------------|");
		System.out.printf("| Book id          | %-51s|\n", bookId);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Author           | %-51s|\n", auther);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Title            | %-51s|\n", title);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Genre            | %-51s|\n", genre);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Price            | %-51s|\n", price);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Publish Date     | %-51s|\n", Date);
		System.out.println("|-----------------------------------------------------------------------|");

		System.out.printf("| Description      | %-51s|\n", discreption);

		System.out.println("=========================================================================");

	}

}
