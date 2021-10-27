package com.company;

/**
 * Klasse des Bogenschützen
 */
public class Bogenschuetze extends Spielfigur {

    private int anzPfeile;

    /**
     * Methode zum Abschiessen der Pfeile mit Ausgabe und herunter zählen der Anzahl der Pfeile
     */
    public void pfeileAbschiessen(int anzPfeile) {
        System.out.println("Es wurden " + anzPfeile + " abgeschossen.");
        this.anzPfeile -= anzPfeile;
    }

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
    public Bogenschuetze(String name, String geschlecht, int anzPfeile) {
        super(name, geschlecht, 60, 65, 65, 20, 35, 0);
        this.anzPfeile = anzPfeile;
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Bogenschütze" + "\n" +
                "anzahl Pfeile=" + anzPfeile + "\n" +
                super.toString();
    }
}
