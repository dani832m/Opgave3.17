// Lille program, der lader brugeren spille Sten, Saks, Papir mod computeren
// Lavet lidt for omstændigt, men jeg fandt først ud af en mere enkel løsning, da jeg havde lavet nedenstående. Dog virker det helt fint :-)

package dk.n4;

import java.util.Scanner; // Importerer Scanner-klassen fra java.util

public class Opgave3_17 {

    public static void main(String[] args) {

        System.out.println("Skal vi spille Sten, Saks, Papir?"); // Udskriver tekst

        System.out.print("Vælg Sten (0) Saks (1) eller Papir (2): "); // Udskriver tekst

        Scanner input = new Scanner(System.in); // Fortæller at vores Scanner input er en ny scanner

        int yourChoice = input.nextInt(); // Deklarerer "yourChoice". Næste brugerindtastning initialiserer desuden variablen

        if (yourChoice == 0) { // Hvis brugeren vælger 0 udskrives næste linje
            System.out.print("Du valgte sten. ");
        } else if (yourChoice == 1) { // Hvis brugeren vælger 1 udskrives næste linje
            System.out.print("Du valgte saks. ");
        } else if (yourChoice == 2) { // Hvis brugeren vælger 2 udskrives næste linje
            System.out.print("Du valgte papir. ");
        } else {
            System.out.print("Fejl ved dit valg. "); // Til debugging
        }

        int computerChoice = (int)(Math.random() * 3); // Fortæller at variablen "computerChoice" initialiseres af auto-generated tal mellem 0 og 2

        if (computerChoice == 0) { // Hvis det auto-genererede tal er 0, udskrives næste linje
            System.out.print("Computeren valgte sten. ");
        } else if (computerChoice == 1) { // Hvis det auto-genererede tal er 1, udskrives næste linje
            System.out.print("Computeren valgte saks. ");
        } else if (computerChoice == 2) { // Hvis det auto-genererede tal er 2, udskrives næste linje
            System.out.print("Computeren valgte papir. ");
        } else {
            System.out.print("Fejl ved computerens valg. "); // Til debugging
        }

        // Følgende if-statements varetager de forskellige udfald af kampen
        if (yourChoice == 0 && computerChoice == 0) { // Hvis du vælger 0 og computerens tal også er 0 udskrives næste linje
            System.out.println("Kampen blev uafgjort.");
        } else if (yourChoice == 0 && computerChoice == 1) { // Hvis du vælger 0 og computerens tal er 1 udskrives næste linje
            System.out.println("Du vandt, fordi sten slår saks. Tillykke!");
        } else if (yourChoice == 0 && computerChoice == 2) {
            System.out.println("Du tabte, fordi papir slår sten.");
        } else if (yourChoice == 1 && computerChoice == 1) {
            System.out.println("Kampen blev uafgjort.");
        } else if (yourChoice == 1 && computerChoice == 0) {
            System.out.println("Du tabte, fordi sten slår saks.");
        } else if (yourChoice == 1 && computerChoice == 2) {
            System.out.println("Du vandt, fordi saks slår papir. Tillykke!");
        } else if (yourChoice == 2 && computerChoice == 2) {
            System.out.println("Kampen blev uafgjort.");
        } else if (yourChoice == 2 && computerChoice == 1) {
            System.out.println("Du tabte, fordi saks slår papir.");
        } else if (yourChoice == 2 && computerChoice == 0) {
            System.out.println("Du vandt, fordi papir slår sten. Tillykke!");
        } else {
            System.out.println("Fejl ved resultat af kampen."); // Til debugging
        }

    }

}