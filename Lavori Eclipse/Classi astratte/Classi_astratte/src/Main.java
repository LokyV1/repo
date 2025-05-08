// Main.java
public class Main {
    public static void main(String[] args) {
        
    	Prof prof = new Prof("Mario", "Rossi");
        Prof prof1 = new Prof("Impero", "Galattico");
    	
    	Studente studente1 = new Studente("Luca", "Bianchi");
        Studente studente2 = new Studente("Anna", "Verdi");
        Studente studente3 = new Studente("Giuliano", "Stilton");
        Studente studente4 = new Studente("Eustachio", "casanova");
        Studente studente5 = new Studente("Paolo", "giordano");
        Studente studente6 = new Studente("Erminio", "ottone");
        Studente studente7 = new Studente("Nino", "Dawngelo");
        Studente studente8 = new Studente("Among", "Oloid");
        Studente studente9 = new Studente("Mento", "Palloneo");
        Studente studente10 = new Studente("Nino", "Dungeon");
        Studente studente11 = new Studente("Pangolino", "ottone");
        Studente studente12 = new Studente("angelo", "Grieco");

        

        prof.aggiungiStudente(studente1);
        prof.aggiungiStudente(studente2);
        prof.aggiungiStudente(studente3);
        prof.aggiungiStudente(studente4);
        prof.aggiungiStudente(studente5);
        prof.aggiungiStudente(studente6);
        prof.aggiungiStudente(studente7);
        prof.aggiungiStudente(studente8);
        
        prof1.aggiungiStudente(studente12);
        prof1.aggiungiStudente(studente11);
        prof1.aggiungiStudente(studente10);
        prof1.aggiungiStudente(studente9);
        
        

        prof.stampainfo();
        System.out.println(" ");
        prof1.stampainfo();
    }
}
