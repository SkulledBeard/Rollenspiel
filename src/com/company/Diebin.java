package com.company;

import java.util.ArrayList;

/**
 * Klasse der Diebin
 */
public class Diebin extends Spielfigur {

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
     * Methode für's stehlen. Wählt eine zufällige Zahl zwischen 0-9 und nimmt diese als Index von der Arraylist gegenstaende
     * und fügt diese der Arrayliste diebesgutKammer hinzu
     */
    public void stehlen() {
        int randomNumber = (int) (Math.random() * 10);
        diebesgutKammer.add(gegenstaende.get(randomNumber - 1));
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
    public Diebin(String name) {
        super(name, "weiblich", 37, 80, 80, 40, 15, 0);
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes mit verweis auf die Oberklasse
     */
    @Override
    public String toString() {
        return "Klasse = Diebin" + "\n" +
                "Diebesgut: " + diebesgutKammer + "\n" +
                super.toString();
    }
}
