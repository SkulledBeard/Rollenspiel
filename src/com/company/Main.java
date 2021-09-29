package com.company;
import java.util.Scanner;

/**
 * Author: Christoph Immisch
 * Projekt: Rollenspiel
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    myMenu();
    }

    public static void myMenu(){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("MyGame Hauptmenü von: Christoph Immisch");
        System.out.println("1) Spiel starten");
        System.out.println("2) Highscores");
        System.out.println("3) Einstellungen");
        System.out.println("4) Über MyGame");
        System.out.println("0) S piel beenden");
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

    private static void ueberMyGame() {
    }

    private static void einstellungen() {
    }

    private static void highscores() {
    }

    private static void spielStarten() {
    }
}
