package helloworld;

public class Film {
	
	  String titolo;
	  String regista;
	  int annodiuscita;

	public Film(String titolo, String regista, int annodiuscita) {
		this.titolo = titolo;
		this.regista = regista;
		this.annodiuscita = annodiuscita;
	} 
	public String getTitolo() {
        return titolo;
    }

    public String getRegista() {
        return regista;
    }

    public int getAnnoDiUscita() {
        return annodiuscita;
    }
    public String toString() {
        return "Titolo: " + titolo + ", Regista: " + regista + ", Anno di uscita: " + annodiuscita;
    }
}
