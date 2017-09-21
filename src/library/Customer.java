package library;

/**
 * Die Klasse beschreibt einen Kunden, der in der Bibliothek
 * ein Buch
 * - ausleihen [ borrow_aBookByTitle() ] oder
 * - zurueckgeben [ bringBackABook() ]
 * will.
 * Die Ausleihe begrenzt sich pro Kunde auf ein Buch.
 * Der Kunde kann gemahnt werden.
 *
 * @Author:Severin Peter
 * @Date:14.09.17
 * @Version:V1.0
 */

import javax.swing.JOptionPane;


public class Customer {

    private String name;
    private Book borrowedBook;
    private Librarian theLibrarian;

    /**
     * Initialisiert ein Objekt vom Typ Kunden mit dem Namen des Kunden.
     * Zudem wird die Referenz zum Bibliothekar mitgeliefert. Diese wird dann
     * gespeichert.
     *
     * @param _name     des Bibliothekar
     * @param theLibrarian auf Bibliothekar
     */
    public Customer(String _name, Librarian theLibrarian) {
        name = _name;
        this.theLibrarian = theLibrarian;
    }


    /**
     * Liefert den Namen des Kunden.
     *
     * @return Name
     */
    public String getName() {
        return name;
    }


    /**
     * Bezieht beim Bibliothekar das Buch, dessen Titel mitgegeben wird.
     * Ist das Buch verfuegbar, wird die Referenz abgespeichert.
     * Andernfalls (Referenz ist null) wird eine entsprechende Meldung ausgegeben.
     *
     * @param title des Buchs
     */
    public void borrow_aBookByTitle() {
    	String title = JOptionPane.showInputDialog("Geben sie den Titel des Buches ein welches sie auslehnen möchten: ");
    	borrowedBook = theLibrarian.borrow_aBookToCustomerByTitle(title);
        if(borrowedBook != null) {
        	borrowedBook.setPlacement(Placement.WithCostumer);
        	System.out.println(name + " leiht Buch '" + borrowedBook.getTitle() + "' aus");
        }
    }
    
    public void borrow_aBookByISBN(int isbn) {
        borrowedBook = theLibrarian.borrow_aBookToCustomerByISBN(isbn);
        if (borrowedBook == null) {
            System.out.println("Schade gibt es das Buch Nr.'" + isbn + "' nicht.");
        }
        else {
        	borrowedBook.setPlacement(Placement.WithCostumer);
            System.out.println(name + " leiht Buch '" + borrowedBook.getTitle() + "' aus");
        }
    }


    /**
     * Bringt dem Bibliothekar das ausgeliehene Buch zurueck.
     * Nach der Rueckgabe des Buchs wird die Referenz auf null gesetzt.
     */
    public void bringBackABook() {
        theLibrarian.getABookFromCustomer(borrowedBook);
    }


    /**

     */
    public void remind() {
        // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
        // Der Text " 'name' bringt Buch 'Titel' zurueck" wird ausgegeben
        //....do it
        System.out.println("");

    }


    /**
     * Liefert den Titel des Buchs, das durch den Kunden ausgeliehen wurde.
     *
     * @return Buchtitel
     */
    public String getTitleOfBorrowedBook() {
        return borrowedBook.getTitle();
    }


	public Book getBorrowedBook() {
		return borrowedBook;
	}
}