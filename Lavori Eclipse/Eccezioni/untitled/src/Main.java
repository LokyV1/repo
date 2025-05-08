import java.util.Scanner;

//chiedi due numeri interi all'utente e stampa il risultato
//gestisci l'errore con il catch

public class Main {
    public static void main(String[]args){



        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Inserisci il primo numero intero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Inserisci il secondo numero intero: ");
            int numero2 = scanner.nextInt();

            int risultato = numero1 / numero2;

            System.out.println("Il risultato è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("divisione non possibile");
        } catch (Exception e) {
            System.out.println("non valido");
        }finally {
            System.out.println("Chiusura...");
        }
    }
}


