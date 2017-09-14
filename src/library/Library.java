/**
 * @Author:Severin Peter
 * @Date:14.09.17
 * @Version:V1.0
 */
package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}

    public Book searchBookByISBN(int isbn) {
    	Book returnBook = null;
    	for(Book book : books) {
    		if(book.getISBN() == isbn) {
    			returnBook = book;
    		}
    	}
    	return returnBook;
    }
    
    public Book searchBookByTitle(String title) {
    	Book returnBook = null;
    	for(Book book : books) {
    		if(book.getTitle() == title) {
    			returnBook = book;
    		}
    	}
    	return returnBook;
    }
    
    public List<Book> getBooksInLIbrary() {
    	List<Book> returnBooks = new ArrayList<Book>();
    	for(Book book : books) {
    		if(book.getPlacement() == Placement.InLibrary) {
    			returnBooks.add(book);
    		}
    	}
    	return returnBooks;
    }
    
    public List<Book> getBooksWithCostumer() {
    	List<Book> returnBooks = new ArrayList<Book>();
    	for(Book book : books) {
    		if(book.getPlacement() == Placement.WithCostumer) {
    			returnBooks.add(book);
    		}
    	}
    	return returnBooks;
    }
    
    public String toString() {
    	String returnString = "";
    	for(Book book : books) {
    		returnString = returnString + book.toString() + System.lineSeparator();
    	}
    	
    	return returnString;
    }
}
