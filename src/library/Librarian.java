package library;

/**
 * Die Klasse repraesentiert den Bibliotheker.
 * <p>Der Bibliothekar;
 * <ul>
 * <li>kauft neue Buecher ein, buyNewBook()</li>
 * <li>leiht Buecher dem Kunden aus, borrow_aBookToCustomer.....()</li>
 * <li>nimmt Buecher zurueck, getABookFromCustomer</li>
 * <li>mahnt den Kunden, remindCustomer()</li>
 * <li>entfernt Buecher aus der Bibliothek, </li>
 * </ul></p>
 *
 * @Author:Severin Peter
 * @Date:14.09.17
 * @Version:V1.0
 */

import javax.swing.JOptionPane;

public class Librarian {

    private Library library;
    private int counter;

    /**
     * Initialisiert das Objekt. Dabei wird die Referenz zur Bibliothek
     * bekannt gemacht.
     */
    public Librarian(Library _library) {
        library = _library;
    }

    /**
     * Ein neues Buch mit Titel und ISBN-Nummer wird der Bibliothek beigefuegt.
     * <p>Die Methode erstellt ein neues Buch und fuegt es der Bibliothek zu.
     * Von der Bibliothek wird der Ablageort mitgeteilt, der dann dem Buch
     * uebergeben wird.</p>
     *
     * @param title des Buchs
     * @param isbn  des Buchs
     */
    public void buyNewBook() {
    	String title = JOptionPane.showInputDialog("Geben sie den Titel des Buches ein: ");
        Book book = new Book(title, counter);
        library.addBook(book);
        JOptionPane.showMessageDialog(null, "Der Bibliothekar erwirbt das Buch " + book.getTitle(), "Message", JOptionPane.PLAIN_MESSAGE);
        counter ++;
    }

    /**
     * Das angefragte Buch wird dem Kunden ausgeliehen.
     * Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem
     * Fall gibt der Bibliothekar einen Hinweis aus.
     *
     * @param title des Buchs
     * @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
     */
    public Book borrow_aBookToCustomerByTitle(String title) {
        return library.searchBookByTitle(title);
    }

    public Book borrow_aBookToCustomerByISBN (int isbn){
        return library.searchBookByISBN(isbn);
    }


        /**
         Das gelieferte Buch wird in die Bibliothek zurueckgestellt.
         @param Referenz auf das Buch
         */

    public void getABookFromCustomer(Book aBook) {
    	if(aBook != null) {
    		aBook.setPlacement(Placement.InLibrary);
    	}
    	else {
    		System.out.println("No Book");
    	}
    }

    /**
     * Erinnert den Kunden, dass eine Ausleihe noch offen ist.
     *
     * @param theCustomer des Kunden, der gemahnt wird
     */
    public void remindCustomer(Customer theCustomer) {
    	JOptionPane.showMessageDialog(null, "Der Kunde " + theCustomer.getName() + " wird gemahnt das Buch " + theCustomer.getTitleOfBorrowedBook() + " zurückzubringen.");
        this.getABookFromCustomer(theCustomer.getBorrowedBook());

    }


    /**
     * Entfernt ein Buch aus der Bibliothek.
     * Das Buch wird anhand seiner Referenz identifiziert.
     *
     * @param title Referenz des Buchs
     */
    public void removeBook() {
    	String title = JOptionPane.showInputDialog("Geben sie den Namen des zu entfernenden Buches ein: ");
        System.out.println(title);
    	Book doomedBook = library.searchBookByTitle(title);
        if(doomedBook != null) {
        	System.out.println("Der Bibliothekar entfernt das Buch " + doomedBook.getTitle() + " aus der Bibliothek");
        	library.removeBook(doomedBook);
        }
        else {
        	System.out.println("Das Buch kann nicht entfernt werden!");
        }
    }
}