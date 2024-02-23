package progettasquadra;
import java.time.*;

// Definizione della classe Allenatore che eredita da Persona
class Allenatore extends Persona {
    private String tattica;
    private int anniEsperienza;
    private int titoliVinti;

	public Allenatore(){}
	
    public Allenatore(String cognome, String nome, String luogoDiNascita, LocalDate dataDiNascita, String tattica, int anniEsperienza, int titoliVinti) {
        super(cognome, nome, luogoDiNascita, dataDiNascita);
        this.tattica = tattica;
        this.anniEsperienza = anniEsperienza;
        this.titoliVinti = titoliVinti;
    }

    public String getTattica() {
        return this.tattica;
    }

    public void setTattica(String tattica) {
        this.tattica = tattica;
    }

    public int getAnniEsperienza() {
        return this.anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public int getTitoliVinti() {
        return this.titoliVinti;
    }

    public void setTitoliVinti(int titoliVinti) {
        this.titoliVinti = titoliVinti;
    }

    @Override
    public String toString() {
	return "\nDati allenatore \n" + super.toString() + "\nTattica: " + this.tattica + "\nAnni di esperienza: " + this.anniEsperienza + "\nTitoli vinti: " + this.titoliVinti + "\n";
    }
}
