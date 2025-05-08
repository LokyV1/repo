package main;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		/** Persona persona1 = new Persona("Mario", "Rossi", 30);
        System.out.println(persona1); // Stampa usando tostring

        // Utilizzo getter
        System.out.println("Nome: " + persona1.getNome());
        System.out.println("Cognome: " + persona1.getCognome());
        System.out.println("Età: " + persona1.getEta());

        // Utilizzo setter
        persona1.setNome("Luigi");
        persona1.setEta(35);
        System.out.println("Persona modificata: " + persona1);

        persona1.setEta(-5); // Esempio di input non valido per l'età
        System.out.println("Persona dopo tentativo di impostare età negativa: " + persona1);
        **/
		
		
		Contobancario conto1 = new Contobancario();
		
		Scanner nomescanner = new Scanner(System.in);
		
		System.out.println("--Benvenuto nella tua banca--");
		System.out.println("1 = deposita");
		System.out.println("2 = preleva");
		System.out.println("3 = Controlla");
		
		String selezione = nomescanner.nextLine();
		
		switch(selezione) {
		case "1" : System.out.println("Inserire importo da depositare");
		int importo = nomescanner.nextInt();
		}
		
		
		
		
		
		nomescanner.close();
	}
	
	

}
