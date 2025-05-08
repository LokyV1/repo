import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        String input = scanner.nextLine();

        int numero = Integer.parseInt(input);
        int raddoppiato = numero * 2;



        String risultato = Integer.toString(raddoppiato);
        System.out.println("Risultato: " + risultato);
    }
}