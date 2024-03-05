package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public void contoAllaRovescia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero:");

        int numero = scanner.nextInt();

        System.out.println("Conto alla rovescia:");

        // (stampato) Conto alla rovescia  a partire dal numero inserito fino a 0
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
