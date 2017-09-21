package library;

/**
 * Hier werden alle benoetigten Objekte erstellt
 * <p>
 * <ul>
 * <li>theLibrary : Library (die Bibliothek)</li>
 * <li>max        : Librarian (der Bibliothekar)</li>
 * <li>moritz     : Customer (ein Kunde)</li>
 * <li>ursula     : Customer (eine Kundin)</li>
 * </ul>
 * </p>
 * <p>
 * <p>Das "Drehbuch" wird gemaess Sequenzdiagramm der Aufgabenstellung
 * implementiert.<br>
 * Dazu braucht es auch Anpassungen in den Klassen
 * <ul>
 * <li>Librarian</li>
 * <li>Customer</li>
 * </ul>
 * Die Klassen Library und Book muessen nicht bearbeitet werden.
 *
 * @Author: Severin Peter
 * @Date: 14.09.17
 * @Version: V1.0
 */
public class LibraryApp {


    /*
    Hier den Ablauf implementieren
    */
    public static void main(String[] args) {
    	
    	//Teilaufgabe 1
        Library library = new Library();
        Librarian librarian = new Librarian(library);
        Customer ursula = new Customer("Ursula", librarian);
        Customer moritz = new Customer("Moritz", librarian);

        //Teilaufgabe 2
        librarian.buyNewBook();
        librarian.buyNewBook();
        librarian.buyNewBook();
        
        System.out.println(library.toString());
        
        // Teilauftrag 3
        
        ursula.borrow_aBookByTitle();
        moritz.borrow_aBookByISBN();
        
        // Teilauftrag 4
       ursula.bringBackABook();
        
        librarian.remindCustomer(moritz);
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // -------------
        // Teilauftrag 5:
        librarian.removeBook();
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

    }
}