package com.company;

/**
 * Klasse des Magiers
 */
public class Magier extends Spielfigur {

    /**
     * Kömpfen Methode zum erhöhen der Erfahrungspunkte
     */
    @Override
    public void kaempfen(int anzGegner) {
        this.exp += (anzGegner * 2);
    }

    /**
     * Methode zur Ausgabe eines Zauberspruches
     */
    public void zauberSpruchAufsagen(String zauber) {
        System.out.println(zauber + " wird gecastet!");
    }

    /**
     * Methode zum erstellen des Objektes bzw der Konstruktor
     */
    public Magier(String name, String geschlecht) {
        super(name, geschlecht, 75, 35, 25, 32, 10, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Magier" + "\n" +
                super.toString();
    }
}
