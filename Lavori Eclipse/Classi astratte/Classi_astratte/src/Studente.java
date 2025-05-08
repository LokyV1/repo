// Studente.java
public class Studente extends Persona {

    public Studente(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public void stampainfo() {
        System.out.println("Studente: " + getNome() + " " + getCognome());
    }
}
