package progettogiocattoli;

import java.util.*;

public class Negozio {
    
    private String nomeNeg;
    private String indirizzo;
    private String telefono;
    private String mail;
    private ArrayList<Costruzioni> costruzioni = new ArrayList<>();
    private ArrayList<Trenino> trenini = new ArrayList<>();

    
    public Negozio(){}
    
    public Negozio(String nomeNeg, String indirizzo, String telefono, String mail) {
        this.nomeNeg = nomeNeg;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNomeNeg() {
        return this.nomeNeg;
    }

    public void setNomeNeg(String nomeNeg) {
        this.nomeNeg = nomeNeg;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String toString(){
        return "/nNome del negozio: " + this.nomeNeg + "/nIndirizzo: " + this.indirizzo + "/nindirizzo email: " + this.mail;
    }
    
	public Trenino ricercaTrenino(String nome) {
        for(int i=0; i<this.trenini.size();i++) {
            Trenino trenino = this.trenini.get(i);
            if (trenino != null && trenino.getNome().equalsIgnoreCase(nome)) {
                return trenino;
            }
        }
        return null;
    }
	
	public Costruzioni ricercaCostruzioni(String nome) {
        for(int i=0; i<this.costruzioni.size();i++) {
            Costruzioni costruzione = this.costruzioni.get(i);
            if (costruzione != null && costruzione.getNome().equalsIgnoreCase(nome)) {
                return costruzione;
            }
        }
        return null;
    }
	
	
}
