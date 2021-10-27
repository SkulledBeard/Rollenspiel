package com.company;

/**
 * Klasse der Krigerin
 */
public class Kriegerin extends Spielfigur {

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
    public Kriegerin(String name) {
        super(name, "weiblich", 62, 50, 40, 60, 80, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Kriegerin" + "\n" +
                super.toString();
    }
}
