package com.company;

/**
 * Klasse des Krigers
 */
public class Krieger extends Spielfigur {

    /**
     * Kömpfen Methode zum erhöhen der Erfahrungspunkte
     */
    @Override
    public void kaempfen(int anzGegner) {
        this.exp += (anzGegner * 2);
    }

    /**
     * Methode zum erstellen des Objektes bzw der Konstruktor
     */
    public Krieger(String name, String geschlecht) {
        super(name, geschlecht, 65, 50, 40, 65, 85, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Krieger" + "\n" +
                super.toString();
    }
}
