import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> rubrica = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        rubrica.put("Mario", "1234567890");
        rubrica.put("Luigi", "0987654321");
        rubrica.put("Anna", "1122334455");
        rubrica.put("Carla", "5566778899");
        rubrica.put("Paolo", "6677889900");

        boolean continua = true;

        while (continua) {
            System.out.println("\nRubrica telefonica:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Cerca un nome");
            System.out.println("2. Esci");
            System.out.println("3. Cerca per numero");
            System.out.println("4. Aggiungi un numero");
            System.out.println("5. Modifica un numero");
            System.out.print("Inserisci la tua scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome della persona di cui vuoi cercare il numero: ");
                    String nomeCercato = scanner.nextLine();
                    if (rubrica.containsKey(nomeCercato)) {
                        System.out.println("Il numero di " + nomeCercato + " è: " + rubrica.get(nomeCercato));
                    } else {
                        System.out.println("Nome non trovato nella rubrica.");
                    }
                    break;
                case 2:
                    continua = false;
                    System.out.println("Uscita dal programma.");
                    break;
                case 3:
                    System.out.print("Inserisci il numero di cui vuoi cercare la persona: ");
                    String numeroCercato = scanner.nextLine();
                    boolean trovato = false;
                    for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                        if (entry.getValue().equals(numeroCercato)) {
                            System.out.println("Numero trovato: " + numeroCercato + ", Nome: " + entry.getKey());
                            trovato = true;
                            break;
                        }
                    }
                    if (!trovato) {
                        System.out.println("Numero non trovato nella rubrica.");
                    }
                    break;
                case 4:
                    System.out.print("Inserisci il nome della persona da aggiungere: ");
                    String nuovoNome = scanner.nextLine();
                    if (rubrica.containsKey(nuovoNome)) {
                        System.out.println("Il nome esiste già nella rubrica.");
                    } else {
                        System.out.print("Inserisci il numero di " + nuovoNome + ": ");
                        String nuovoNumero = scanner.nextLine();
                        rubrica.put(nuovoNome, nuovoNumero);
                        System.out.println("Contatto aggiunto con successo.");
                    }
                    break;
                case 5:
                    System.out.print("Inserisci il nome della persona di cui vuoi modificare il numero: ");
                    String nomeDaModificare = scanner.nextLine();
                    if (rubrica.containsKey(nomeDaModificare)) {
                        System.out.print("Inserisci il nuovo numero per " + nomeDaModificare + ": ");
                        String numeroModificato = scanner.nextLine();
                        rubrica.put(nomeDaModificare, numeroModificato);
                        System.out.println("Numero aggiornato con successo.");
                    } else {
                        System.out.println("Nome non trovato nella rubrica.");
                    }
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}