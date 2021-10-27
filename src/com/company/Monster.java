package com.company;

/**
 * Klasse des Monsters
 */
public class Monster extends Spielfigur {

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
    public Monster(String name, String geschlecht) {
        super(name, geschlecht, 85, 25, 20, 85, 60, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Monster" + "\n" +
                super.toString();
    }
}
