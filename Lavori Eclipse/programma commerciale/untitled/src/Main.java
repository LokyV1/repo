import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Creazione della mappa con prodotti e prezzi
        HashMap<String, Double> prodotti = new HashMap<>();
        prodotti.put("Mela", 1.2);
        prodotti.put("Pane", 2.5);
        prodotti.put("Latte", 1.8);
        prodotti.put("Formaggio", 3.7);

        // Stampa di tutti i prodotti
        System.out.println("Lista di tutti i prodotti:");
        for (Map.Entry<String, Double> entry : prodotti.entrySet()) {
            System.out.println(entry.getKey() + ": €" + entry.getValue());
        }

        // Stampa dei prodotti con prezzo sopra una certa soglia
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInserisci la soglia di prezzo: ");
        double soglia = scanner.nextDouble();

        System.out.println("\nProdotti con prezzo sopra €" + soglia + ":");
        for (Map.Entry<String, Double> entry : prodotti.entrySet()) {
            if (entry.getValue() > soglia) {
                System.out.println(entry.getKey() + ": €" + entry.getValue());
            }
        }

        // Calcolo del prezzo medio
        double somma = 0;
        for (double prezzo : prodotti.values()) {
            somma += prezzo;
        }
        double prezzoMedio = somma / prodotti.size();
        System.out.println("\nPrezzo medio: €" + prezzoMedio);

        scanner.close();
    }
}
