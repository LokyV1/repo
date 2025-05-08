package Calcolatrice;
import java.util.Scanner;

public class Main {
	
	//calcolatrice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("primo numero");
		Calcolatrice.a = scanner.nextInt();
		
		System.out.println("Secondo");
		Calcolatrice.b = scanner.nextInt();
		
		System.out.println("operazione");
		System.out.println("1. +");
        System.out.println("2. *");
		
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("La somma è: " + Calcolatrice.somma());
                break;
            case 2:
                System.out.println("La moltiplicazione è: " + Calcolatrice.moltiplicazione());
                break;
            default:
                System.out.println("Operazione non valida");
        }
        
		scanner.close();
		

		
		
	}

}
