package progettoconcessionario;

import java.util.ArrayList;

public class ProgettoVeicoli {
    private String nome;
    private String indirizzo;
    private String email;
    private String numTel;
    private ArrayList<Veicolo> veicoli = new ArrayList<>();

    public ProgettoVeicoli(){}
    
    public ProgettoVeicoli(String nome, String indirizzo, String email, String numTel) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.email = email;
        this.numTel = numTel;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTel() {
        return this.numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public ArrayList<Veicolo> getVeicoli() {
        return this.veicoli;
    }

    public void setVeicoli(ArrayList<Veicolo> veicoli) {
        this.veicoli = veicoli;
    }
    
    public void aggiungiVeicolo(Veicolo veicolo){
        this.veicoli.add(veicolo);
        System.out.println("Veicolo aggiunto alla concessionaria: " + "Targa: "+ veicolo.getTarga() + "Marca: " + veicolo.getMarca() + "Modello: " + veicolo.getModello() + "Prezzo: " + veicolo.getPrezzo());        
    }
    
    public Veicolo ricercaVeicolo(String targa){
        for(int i = 0; i <this.veicoli.size(); i++){
            Veicolo veicolo = this.veicoli.get(i);
            if(veicolo != null && veicolo.getTarga().equalsIgnoreCase(targa)){
                return veicolo;
            }
        }
        return null;
    }
    
    public void visualizzaVeicoli(){
        System.out.println("Veicoli in concessionario: ");
        for(int i = 0; i<this.veicoli.size(); i++){
            System.out.println(veicoli.get(i).toString());
        }
    }
    
    @Override
    public String toString(){
        return "Nome del concessionario: " + this.nome + "Indirizzo civico: " + this.indirizzo + "Indirizzo email: " + this.email + "Numero di telefono: " + this.numTel;
    }
    
}
