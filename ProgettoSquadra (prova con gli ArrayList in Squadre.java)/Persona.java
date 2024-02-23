package progettasquadra;

import java.time.*; //E' utilizzaton per gestire la data di nascita

// Definizione della classe Persona
class Persona {
   
    private String cognome;
    private String nome;
    private String luogoDiNascita;
    private LocalDate dataDiNascita;

    public Persona(){}
	
    public Persona(String cognome, String nome, String luogoDiNascita, LocalDate dataDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.luogoDiNascita = luogoDiNascita;
        this.dataDiNascita = dataDiNascita;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
	
	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogoDiNascita() {
        return this.luogoDiNascita;
    }

    public void setLuogoDiNascita(String luogoDiNascita) {
        this.luogoDiNascita = luogoDiNascita;
    }

    public LocalDate getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Cognome: " + this.cognome + "\nNome: " + this.nome + "\nLuogo di nascita e data di nascita: " + this.luogoDiNascita + " " + this.dataDiNascita;
    }
}
