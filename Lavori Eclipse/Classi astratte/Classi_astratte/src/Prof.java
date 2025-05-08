// Prof.java
import java.util.ArrayList;
import java.util.List;

public class Prof extends Persona {
    private List<Studente> studenti;

    public Prof(String nome, String cognome) {
        super(nome, cognome);
        this.studenti = new ArrayList<>();
    }
    

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    @Override
    public void stampainfo() {
        System.out.println("Professore: " + getNome() + " " + getCognome());
        System.out.println("Alunni:");
        for (Studente studente : studenti) {
            System.out.println("- " + studente.getNome() + " " + studente.getCognome());
        }
    }
}
