package progettogiocattoli;

import java.util.*;

public class Negozio {
    
    private String nomeNeg;
    private String indirizzo;
    private String telefono;
    private String mail;
    private ArrayList<Costruzioni> = new ArrayList<Costruzioni>();
    private ArrayList<Trenino> = new ArrayList<Trenino>();

    
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
    
}
