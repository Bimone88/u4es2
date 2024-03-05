package esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public void eseguiEsercizio3() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa o \":q\" per terminare:");

        while (true) {
            input = scanner.nextLine();

            if (input.equals(":q")) {
                break; // se l'utente inserisce ":q" si esce dal loop
            }

            // stringa suddivisa in caratteri separati dalla virgola
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i != input.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
