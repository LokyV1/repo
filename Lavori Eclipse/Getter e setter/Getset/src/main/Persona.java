package main;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome(){
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome() {
		this.cognome = cognome;
	}
	public void setEta() {
		this.eta = eta;
	}
	
	public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("L'età non può essere negativa.");
        }
    }
	public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Età: " + eta;
    }
	
}
