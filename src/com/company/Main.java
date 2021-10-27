package com.company;

import java.util.Scanner;

/**
 * Author: Christoph Immisch
 * Projekt: Rollenspiel
 * Main- oder Hauptklasse in der sich das Userinterface befindet und der Test.
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);
    static Bogenschuetze b1 = new Bogenschuetze("Bogenknilch", "männlich", 100);
    static Dieb d1 = new Dieb("Diebknilch", "männlich");
    static Diebin di1 = new Diebin("Diebindame");
    static Magier m1 = new Magier("Magierknilch", "männlich");
    static Monster mo1 = new Monster("Monsterknilch", "männlich");
    static Krieger k1 = new Krieger("Kriegerknilch", "männlich");
    static Kriegerin kr1 = new Kriegerin("Krigerdame");
    /**
     * Main Methode die die Arraylisten der Diebe mit Gegenständen füllt und die Methode myMenue aufruft.
     */
    public static void main(String[] args) {
        Dieb.randomArrayFuellen();
        Diebin.randomArrayFuellen();
        myMenu();
    }

    /**
     * Hauptmenue mit eingabe durch den Benutzer und Abgleich durch Switch/Case
     */
    public static void myMenu() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("MyGame Hauptmenü von: Christoph Immisch");
        System.out.println("1) Spiel starten");
        System.out.println("2) Highscores");
        System.out.println("3) Einstellungen");
        System.out.println("4) Über MyGame");
        System.out.println("0) Spiel beenden");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Bitte wählen:");

        int eingabe = sc.nextInt();

        switch (eingabe) {
            case 1 -> spielStarten();
            case 2 -> highscores();
            case 3 -> einstellungen();
            case 4 -> ueberMyGame();
            case 0 -> System.exit(1);
            default -> {
                System.out.println("Falsche Eingabe");
                myMenu();
            }
        }
    }

    /**
     * ueberMyGame Methode in der nur der Ersteller angezeigt wird mit Datum der Erstellung
     */
    private static void ueberMyGame() {

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Projekt Rollenspiel von Christoph Immisch");
        System.out.println("Erstellt am 27.10.2021");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Möchten Sie zurück zum Hauptmenue?");
        System.out.println("1) Ja (Hauptmenue)");
        System.out.println("2) Nein (Programm beenden)");

        int eingabe = sc.nextInt();

        switch (eingabe) {
            case 1 -> myMenu();
            case 2 -> {
                System.out.println("Möchten Sie wirklich das Spiel beenden?");
                System.out.println("1) Ja");
                System.out.println("2) Nein");

                eingabe = sc.nextInt();
                switch (eingabe) {
                    case 1 -> System.exit(1);
                    case 2 -> myMenu();
                    default -> {
                        System.out.println("Falsche Eingabe");
                        myMenu();
                    }
                }
            }
            default -> {
                System.out.println("Falsche Eingabe");
                myMenu();
            }
        }
    }

    /**
     * Einstellungen Methode in der sich Augaben befindet etc.
     */
    private static void einstellungen() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Leider keine Einstellungsmöglichkeiten.");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Möchten Sie zurück zum Hauptmenue?");
        System.out.println("1) Ja (Hauptmenue)");
        System.out.println("2) Nein (Programm beenden)");

        int eingabe = sc.nextInt();

        switch (eingabe) {
            case 1 -> myMenu();
            case 2 -> {
                System.out.println("Möchten Sie wirklich das Spiel beenden?");
                System.out.println("1) Ja");
                System.out.println("2) Nein");

                eingabe = sc.nextInt();
                switch (eingabe) {
                    case 1 -> System.exit(1);
                    case 2 -> myMenu();
                    default -> {
                        System.out.println("Falsche Eingabe");
                        myMenu();
                    }
                }
            }
            default -> {
                System.out.println("Falsche Eingabe");
                myMenu();
            }
        }
    }

    /**
     * Highscores Methode in der sich Augaben befindet etc.
     */
    private static void highscores() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Leider keine Highscores.");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Möchten Sie zurück zum Hauptmenue?");
        System.out.println("1) Ja (Hauptmenue)");
        System.out.println("2) Nein (Programm beenden)");

        int eingabe = sc.nextInt();

        switch (eingabe) {
            case 1 -> myMenu();
            case 2 -> {
                System.out.println("Möchten Sie wirklich das Spiel beenden?");
                System.out.println("1) Ja");
                System.out.println("2) Nein");

                eingabe = sc.nextInt();
                switch (eingabe) {
                    case 1 -> System.exit(1);
                    case 2 -> myMenu();
                    default -> {
                        System.out.println("Falsche Eingabe");
                        myMenu();
                    }
                }
            }
            default -> {
                System.out.println("Falsche Eingabe");
                myMenu();
            }
        }
    }

    /**
     * spielStarten Methode in der nur die myTest Methode aufgerufen wird.
     */
    private static void spielStarten() {
        myTests();
    }

    /**
     * In dieser Methode werden die Objekte der Helden erstellt und mit den Grundwerten ausgegeben,
     * danach kämpfen alle Helden und benutzen Ihre Spezialfähigkeiten.
     * Dann werden die nun erhöhten Werte der Helden neu ausgegeben.
     */
    private static void myTests() {


        System.out.println("------------------------Ausgabe vorm Kampf--------------------------\n");

        System.out.println(b1);
        System.out.println(d1);
        System.out.println(di1);
        System.out.println(m1);
        System.out.println(mo1);
        System.out.println(k1);
        System.out.println(kr1);

        System.out.println("------------------------Kampf--------------------------\n");

        b1.kaempfen(1);
        b1.pfeileAbschiessen(5);

        d1.kaempfen(2);
        d1.stehlen();

        di1.kaempfen(3);
        di1.stehlen();

        m1.kaempfen(4);
        m1.zauberSpruchAufsagen("Apokalypse");

        mo1.kaempfen(5);

        k1.kaempfen(6);

        kr1.kaempfen(7);

        System.out.println("------------------------Ausgabe nachm Kampf--------------------------\n");

        System.out.println(b1);
        System.out.println(d1);
        System.out.println(di1);
        System.out.println(m1);
        System.out.println(mo1);
        System.out.println(k1);
        System.out.println(kr1);

        System.out.println("Möchten Sie zurück zum Hauptmenue?");
        System.out.println("1) Ja (Hauptmenue)");
        System.out.println("2) Nein (Programm beenden)");

        int eingabe = sc.nextInt();

        switch (eingabe) {
            case 1 -> myMenu();
            case 2 -> {
                System.out.println("Möchten Sie wirklich das Spiel beenden?");
                System.out.println("1) Ja");
                System.out.println("2) Nein");

                eingabe = sc.nextInt();
                switch (eingabe) {
                    case 1 -> System.exit(1);
                    case 2 -> myMenu();
                    default -> {
                        System.out.println("Falsche Eingabe");
                        myMenu();
                    }
                }
            }
            default -> {
                System.out.println("Falsche Eingabe");
                myMenu();
            }
        }
    }
}
