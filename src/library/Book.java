package library;

/**
 * @Author:Severin Peter
 * @Date:14.09.17
 * @Version:V1.0
*/

public class Book {
	
	private String title;
	private int isbn;
	private Placement placement;

	public Book(String title, int isbn) {
		setName(title);
		setISBN(isbn);
	}

	private void setISBN(int isbn) {
		this.isbn = isbn;		
	}

	private void setName(String title) {
		this.title = title;		
	}
	
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}
	
	public Placement getPlacement() {
		return this.placement;
	}

	public String getTitle() {
		return this.title;
	}
	
	public int getISBN() {
		return this.isbn;
	}
	
	public String toString() {
		String returnString;
		returnString = "Titel: " + this.title + " ISBN: " + this.isbn;
		
		return returnString;
	}

}
