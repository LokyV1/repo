import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inizializza scanner e insieme
        Scanner scanner = new Scanner(System.in);
        Set<String> animali = new HashSet<>();

        // Insieme di animali
        animali.add("cane");
        animali.add("gatto");
        animali.add("topo");
        animali.add("capra");
        animali.add("mucca");
        animali.add("pecora");

        int scelta;

        do {
            // Stampa il menu
            System.out.println("Animali disponibili:");
            for (String animale : animali) {
                System.out.println(animale);
            }

            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Aggiungere un animale");
            System.out.println("2. Rimuovere un animale");
            System.out.println("3. Ordinare gli animali");
            System.out.println("4. Ordinamento inverso");
            System.out.println("5. Uscire");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Risolve il newline

            // Gestione delle scelte
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome dell'animale da aggiungere:");
                    String animaleDaAggiungere = scanner.nextLine();
                    if (animali.contains(animaleDaAggiungere)) {
                        System.out.println("L'animale è già presente.");
                    } else {
                        animali.add(animaleDaAggiungere);
                        System.out.println("Animale aggiunto con successo.");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il nome dell'animale da rimuovere:");
                    String animaleDaRimuovere = scanner.nextLine();
                    if (animali.contains(animaleDaRimuovere)) {
                        animali.remove(animaleDaRimuovere);
                        System.out.println("Animale rimosso con successo.");
                    } else {
                        System.out.println("L'animale non è presente nell'insieme.");
                    }
                    break;
                case 3:
                    System.out.println("Animali ordinati:");
                    ArrayList<String> animaliOrdinati = new ArrayList<>(animali);
                    Collections.sort(animaliOrdinati);
                    for (String animale : animaliOrdinati) {
                        System.out.println(animale);
                    }
                    break;
                case 4:
                    System.out.println("Animali ordinati in ordine inverso:");
                    ArrayList<String> animaliInversi = new ArrayList<>(animali);
                    animaliInversi.sort(Collections.reverseOrder());
                    for (String animale : animaliInversi) {
                        System.out.println(animale);
                    }
                    break;
                case 5:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 5);

        // Stampa l'insieme finale degli animali
        System.out.println("Insieme finale degli animali:");
        for (String animale : animali) {
            System.out.println(animale);
        }

        scanner.close();
    }
}