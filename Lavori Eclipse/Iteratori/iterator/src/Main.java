import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione della mappa
        Map<String, Integer> studenti = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Aggiunta di 3 studenti
        studenti.put("Mario", 85);
        studenti.put("Luigi", 90);
        studenti.put("Anna", 78);

        // Stampa di tutti gli studenti con i voti
        System.out.println("Elenco degli studenti con i voti:");
        for (Map.Entry<String, Integer> entry : studenti.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // Modifica del voto di uno studente
            System.out.println("Inserisci il nome dello studente per modificare il voto:");
        String nome = scanner.nextLine();
            if (studenti.containsKey(nome)) {
            System.out.println("Inserisci il nuovo voto:");
            int nuovoVoto = scanner.nextInt();
            studenti.put(nome, nuovoVoto);
            System.out.println("Voto aggiornato.");
        } else {
            System.out.println("Studente non trovato.");
        }

        // Ricerca del voto per nome
        scanner.nextLine(); // Consuma la nuova linea
        System.out.println("Inserisci il nome dello studente per cercare il voto:");
        nome = scanner.nextLine();
        if (studenti.containsKey(nome)) {
            System.out.println("Il voto di " + nome + " è: " + studenti.get(nome));
        } else {
            System.out.println("Studente non trovato.");
        }

        // Stampa tutte le coppie entrySet
        System.out.println("Elenco aggiornato degli studenti con i voti:");
        for (Map.Entry<String, Integer> entry : studenti.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}