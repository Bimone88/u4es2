package esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {
        // Test dei metodi
        System.out.println("La stringa 'ciao' ha un numero di caratteri pari? " + stringaPariDispari("ciao"));
        System.out.println("L'anno 2024 è bisestile? " + annoBisestile(2024));
    }

    // Metodo per determinare se una stringa ha un numero pari o dispari di caratteri
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0; // Se il numero di caratteri è pari ritorna true, altrimenti ritorna false
    }

    // Metodo per determinare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 != 0 || (anno % 100 == 0 && anno % 400 == 0)) {
                return true; // Se l'anno è divisibile per 4 e (non è divisibile per 100 o è divisibile per 400) ritorna true
            }
        }
        return false; // Altrimenti ritorna false
    }
}

