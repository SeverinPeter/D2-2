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
        Librarian max = new Librarian(library);   
        Customer ursula = new Customer("Ursula", max);
        Customer moritz = new Customer("Moritz", max);

        //Teilaufgabe 2
        max.buyNewBook("A Study In Scarlet", 1);
        max.buyNewBook("The Hound Of The Baskervilles", 2);
        max.buyNewBook("The Sign Of The Four", 3);
        max.buyNewBook("The Valley Of Fear", 4);
        max.buyNewBook("The Return Of Sherlock Holmes", 5);
        System.out.println(library.toString());
        System.out.println("Der Bibliothekar kauft neue Buecher und stellt diese in die Bibliothek");
        
        // Teilauftrag 3
        
        ursula.borrow_aBookByTitle("A Study In Scarlet");
        moritz.borrow_aBookByISBN(4);
        System.out.println("\n\nEs erfolgen Ausleihen");
        
        // Teilauftrag 4
       ursula.bringBackABook();
        System.out.println("\n\nKundin " + ursula.getName() + " bringt ein Buch zurueck");
        
        max.remindCustomer(moritz);
        System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // -------------
        // Teilauftrag 5:
        max.removeBook("A Study In Scarlet");
        System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

    }
}