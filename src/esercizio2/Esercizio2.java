package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public void eseguiEsercizio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero compreso tra 0 e 3:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: Il numero non è compreso tra 0 e 3");
        }

        scanner.close();
    }
}

