package progettasquadra;

import java.time.*;

// Definizione della classe Giocatore che eredita da Persona
class Giocatore extends Persona {
    private String ruolo;
    private int numeroMaglia;

    public Giocatore(){}
	
    public Giocatore(String cognome, String nome, String luogoDiNascita, LocalDate dataDiNascita, String ruolo, int numeroMaglia) {
        super(cognome, nome, luogoDiNascita, dataDiNascita);
        this.ruolo = ruolo;
        this.numeroMaglia = numeroMaglia;
    }

    public String getRuolo() {
        return this.ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public int getNumeroMaglia() {
        return this.numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    @Override
    public String toString() {
        return "Dati giocatore \n" + super.toString() + "\nRuolo: " + this.ruolo + "\nNumero maglia: " + this.numeroMaglia;
    }
}
