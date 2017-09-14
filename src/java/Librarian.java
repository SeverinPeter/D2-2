package java;

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
 * @Author: bitte Namen ergaenzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachfuehren
 */
public class Librarian {

    private Library library;

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
    public void buyNewBook(String title, String isbn) {
        // nach Sequenzdiagramm implementieren
        //....do it
    
    
    /* Hinweis:
    Aufrufe koennen ineinander geschachtelt sein. Es ist ueblich, das
    so zu machen, dient aber nicht der Uebersichtlichkeit (vor allem
    nicht fuer Anfnger).
    */
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
        // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
        // gezeigten Struktogrammden Code.
        //
        //    +-----------------------------------------------------------------+
        //    � suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      �
        //    +-----------------------------------------------------------------+
        //    � if (gueltige Buchreferenez)                                      �
        //    �    --+----------------------------------------------------------+
        //    � then  > return Buchreferenz                                    �
        //    �    --+----------------------------------------------------------+
        //    � else  gib eine Meldung aus, dass Buchtitel nicht in Bibliothek �
        //    �      +----------------------------------------------------------+
        //    �       > return null                                            �
        //    +------+----------------------------------------------------------+
        //
        //....do it
        return null;
    }

        /**
         Das angefragte Buch wird dem Kunden ausgeliehen.
         Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem
         Fall gibt der Bibliothekar einen Hinweis aus.
         @param search_isbn des Buchs
         @return Book Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
         */
        public Book borrow_aBookToCustomerByISBN (String  search_isbn){
            Book aBook = library.searchBookByISBN(search_isbn);
            if (aBook != null) {
                return aBook;
            } // end of if
            else {
                System.out.println("Das Buch mit der ISBN-Numemr'" + search_isbn + "' ist nicht verfuegbar");
                return null;
            }
        }


        /**
         Das gelieferte Buch wird in die Bibliothek zurueckgestellt.
         @param Referenz auf das Buch
         */

    public void getABookFromCustomer(Book aBook) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
        //....do it

    }

    /**
     * Erinnert den Kunden, dass eine Ausleihe noch offen ist.
     *
     * @param theCustomer des Kunden, der gemahnt wird
     */
    public void remindCustomer(Customer theCustomer) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
        // Der Text "Kunde 'name' wird gemahnt, das Buch 'Titel' zurueckzubringen" wird ausgegeben
        //....do it
        System.out.println("");

    }


    /**
     * Entfernt ein Buch aus der Bibliothek.
     * Das Buch wird anhand seiner Referenz identifiziert.
     *
     * @param title Referenz des Buchs
     */
    public void removeBook(String title) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
        // gezeigten Struktogrammden Code.
        //
        //    +-----------------------------------------------------------------+
        //    � suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      �
        //    +-----------------------------------------------------------------+
        //    � if (gueltige Buchreferenz)                                       �
        //    �    --+----------------------------------------------------------+
        //    � then  entferen Buch aus der Bibliothek                         �
        //    +------+----------------------------------------------------------+
        //
        //....do it

    }
}