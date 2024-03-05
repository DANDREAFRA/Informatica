
package progettoveterinario;

import java.util.*;
public class StudioVeterinario {
    
    private String nome;
    private String indirizzo;
    private String telefono;
    private String mail;
    private boolean assistenza;
    private ArrayList<Animale> animali = new ArrayList<Animale>;

    public StudioVeterinario(String mail, String nome, String indirizzo, String telefono, boolean assistenza) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.mail = mail;
        this.assistenza = assistenza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }    
    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isAssistenza() {
        return assistenza;
    }

    public void setAssistenza(boolean assistenza) {
        this.assistenza = assistenza;
    }
    
    public void aggiungiAnimale(Animale animali){
        animali.add(animali);
    }
    
    public void visualizzaStudioVeterinario(){
        System.out.println(animali.size());
    }
    
    public String toString(){
        return "/nNome: " + this.nome + "/nIndirizzo: " + this.indirizzo + "/nEmail: " + this.mail + "/nNumero di telefono: " + this.telefono + "/nAssistenza: " + this.assistenza;
    }
    
    
}
