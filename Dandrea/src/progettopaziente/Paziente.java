package progettopaziente;

public class Paziente {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String codFisc;
    
    public Paziente(){}

    public Paziente(String nome, String cognome, String dataNascita, String codFisc) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codFisc = codFisc;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCodFisc() {
        return this.codFisc;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }
    
    @Override
    public String toString(){
        return "/nNome: " + this.nome + "/nCognome: " + this.cognome + "/nData di nascita: " + this.dataNascita + "/nCodice fiscale: " + this.codFisc;
    }
    
}
