package com.company;

/**
 * Elternklasse Spielfigur welche abstract ist
 */
public abstract class Spielfigur {
    String name;
    String geschlecht;
    double groesse;
    int ausdauer;
    int schnelligkeit;
    int schlagkraft;
    int ruestungssaerke;
    int exp;

    /**
     * Kömpfen Methode zum erhöhen der Erfahrungspunkte
     */
    public void kaempfen(int anzGegner) {
        this.exp += (anzGegner * 2);
    }

    /**
     * Konstruktor
     */
    public Spielfigur(String name, String geschlecht, double groesse, int ausdauer, int schnelligkeit, int schlagkraft, int ruestungssaerke, int exp) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.groesse = groesse;
        this.ausdauer = ausdauer;
        this.schnelligkeit = schnelligkeit;
        this.schlagkraft = schlagkraft;
        this.ruestungssaerke = ruestungssaerke;
        this.exp = exp;
    }

    /**
     * Setter und Getter
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public int getAusdauer() {
        return ausdauer;
    }

    public void setAusdauer(int ausdauer) {
        this.ausdauer = ausdauer;
    }

    public int getSchnelligkeit() {
        return schnelligkeit;
    }

    public void setSchnelligkeit(int schnelligkeit) {
        this.schnelligkeit = schnelligkeit;
    }

    public int getSchlagkraft() {
        return schlagkraft;
    }

    public void setSchlagkraft(int schlagkraft) {
        this.schlagkraft = schlagkraft;
    }

    public int getRuestungssaerke() {
        return ruestungssaerke;
    }

    public void setRuestungssaerke(int ruestungssaerke) {
        this.ruestungssaerke = ruestungssaerke;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * Methode zur Ausgabe der Eigenschaften des Objektes
     */
    @Override
    public String toString() {
        return
                "Name= " + name + "\n" +
                        "Geschlecht= " + geschlecht + "\n" +
                        "Groesse= " + groesse + "\n" +
                        "Ausdauer= " + ausdauer + "\n" +
                        "Schnelligkeit= " + schnelligkeit + "\n" +
                        "Schlagkraft= " + schlagkraft + "\n" +
                        "Ruestungssaerke= " + ruestungssaerke + "\n" +
                        "Erfahrungspunkte= " + exp + "\n";
    }
}
