package java;

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
 * @Author: bitte Namen ergaenzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachfuehren
 */
public class LibraryApp {


    /*
    Hier den Ablauf implementieren
    */
    public static void main(String[] args) {
        // Teilauftrag 1
        // -------------
        // Deklaration der Hauptklassen
        //....do it

        Customer ursula = null;
        Customer moritz = null;

        // Erzeugen der Objekte
        //....do it


        // -------------
        // Teilauftrag 2
        // -------------
        // Buecher in die Bibliothek einreihen
        System.out.println("Der Bibliothekar kauft neue Buecher und stellt diese in die Bibliothek");
        //...do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // -------------
        // Teilauftrag 3
        //--------------
        // Kunden leihen ein Buch aus
        System.out.println("\n\nEs erfolgen Ausleihen");
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // -------------
        // Teilauftrag 4
        // -------------
        // Eine Kundin bringt das Buch selbstaendig zurueck.
        System.out.println("\n\nKundin " + ursula.getName() + " bringt ein Buch zurueck");
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // Ein Kunde wird gemahnt und bringt dann sein Buch zurueck
        System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

        // -------------
        // Teilauftrag 5:
        // --------------
        //Der Bibliothekar entfernt ein Buch aus der Bibliothek
        System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
        //....do it

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        //....do it

    }
}