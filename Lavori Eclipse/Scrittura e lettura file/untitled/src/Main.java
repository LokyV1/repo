/**
 * Esercizio 1 - Scrittura semplice
 * Chiedi all'utente di inserire 3 frasi e salvarle in un file chiamato frasi.txt
 * Esercizio 2 - Lettura semplice
 * Leggi il contenuto del file frasi.txt e stampalo su console
 * Esercizio 3 - Conta le righe
 * Leggi un file e stampa il numero delle righe che contiene
 * Esercizio 4 - Copia file
 * Leggi riga per riga un file frasi.txt e copia il contenuto in un file copia.txt
 */

public class Main {
    public static void main(String[] args) {
        // Esercizio 1 - Scrittura semplice
        String nomefile = "frasi.txt";
        String[] frasi = new String[3];
        for (int i = 0; i < frasi.length; i++) {
            System.out.print("Inserisci la frase " + (i + 1) + ": ");
            frasi[i] = System.console().readLine();
        }
        try (java.io.PrintWriter writer = new java.io.PrintWriter(nomefile)) {
            for (String frase : frasi) {
                /**
                 * Il blocco in commento affianco a frase
                 * serve a testare se il lettore di righe funziona
                 * rimuovere il commento e renderlo codice funzionante
                 * porterà il numero di righe a 6 invece che le solite 3
                 **/
                writer.println(frase /** + "\n" **/);
            }
        } catch (java.io.IOException e) {
            System.err.println("Errore durante la scrittura: " + e.getMessage());
        }

        // Esercizio 2 - Lettura semplice
        try (java.io.BufferedReader lettore = new java.io.BufferedReader(new java.io.FileReader(nomefile))) {
            String line;
            while ((line = lettore.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            System.err.println("Errore durante la lettura: " + e.getMessage());
        }

        // Esercizio 3 - Conta le righe
        int conta = 0;
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(nomefile))) {
            while (reader.readLine() != null) {
                conta++;
            }
            System.out.println("Numero di righe nel file: " + conta);
        } catch (java.io.IOException e) {
            System.err.println("Errore durante la lettura: " + e.getMessage());
        }

        // Esercizio 4 - Copia file
        String copia = "copia.txt";
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(nomefile));
             java.io.PrintWriter writer = new java.io.PrintWriter(copia)) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println("Copia di: " + line);
            }
        } catch (java.io.IOException e) {
            System.err.println("Errore durante la copia: " + e.getMessage());
        }
    }

}
