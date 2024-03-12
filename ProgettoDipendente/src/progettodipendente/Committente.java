package progettodipendente;

import java.time.LocalDate;

public class Committente extends Persona {
    
    private String nomeAz;
    private String numTel;
    private String mail;
    private String indirizzo;

    public Committente(String nomeAz, String numTel, String mail, String indirizzo, String codFisc, String nome, String cognome, String luogoDiNascita, LocalDate dataDiNascita) {
        super(codFisc, cognome, nome, luogoDiNascita, dataDiNascita);
        this.nomeAz = nomeAz;
        this.numTel = numTel;
        this.mail = mail;
        this.indirizzo = indirizzo;
    }

    public String getNomeAz() {
        return nomeAz;
    }

    public void setNomeAz(String nomeAz) {
        this.nomeAz = nomeAz;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String toString(){
        return super.toString() + "/nNome Azienda: " + this.nomeAz + "/nNumero di Telefono: " + this.numTel + "/nIndirizzo: " + this.indirizzo + "/nEmail: " + this.mail;
    }


    
}
