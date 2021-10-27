package com.company;

import java.util.ArrayList;

/**
 * Klasse des Dibes
 */
public class Dieb extends Spielfigur {

    private ArrayList<String> diebesgutKammer = new ArrayList<>();
    private static ArrayList<String> gegenstaende = new ArrayList<>();

    /**
     * Methode zum füllen der Arrayliste mit den vorgegebenen Gegenständen
     */
    public static void randomArrayFuellen() {
        gegenstaende.add("Goldring");
        gegenstaende.add("Goldkette");
        gegenstaende.add("Schatzkiste");
        gegenstaende.add("Münzen");
        gegenstaende.add("Geldbeutel");
        gegenstaende.add("Silberbrosche");
        gegenstaende.add("Apfel");
        gegenstaende.add("Brot");
        gegenstaende.add("Silberring");
        gegenstaende.add("Silberamulet");
    }

    /**
     * Kömpfen Methode zum erhöhen der Erfahrungspunkte
     */
    @Override
    public void kaempfen(int anzGegner) {
        this.exp += (anzGegner * 2);
    }

    /**
     * Methode für's stehlen. Wählt eine zufällige Zahl zwischen 0-9 und nimmt diese als Index von der Arraylist gegenstaende
     * und fügt diese der Arrayliste diebesgutKammer hinzu
     */
    public void stehlen() {
        int randomNumber = (int) (Math.random() * 10);
        diebesgutKammer.add(gegenstaende.get(randomNumber - 1));

    }

    /**
     * Methode zum erstellen des Objektes bzw der Konstruktor
     */
    public Dieb(String name, String geschlecht) {
        super(name, geschlecht, 40, 85, 85, 40, 15, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Dieb" + "\n" +
                "Diebesgut: " + diebesgutKammer + "\n" +
                super.toString();
    }
}
