package progettopaziente;

import java.util.ArrayList;

public class Ospedale {
    private String nomeOsp;
    private String numTel;
    private String email;
    private String indirizzo;
    private ArrayList<PazienteAmbulatoriale> pazientiAmbulatoriali = new ArrayList<>();
    private ArrayList<PazienteRicoverato> pazientiRicoverati = new ArrayList<>();

    public Ospedale(){}
    
    public Ospedale(String nomeOsp, String numTel, String email, String indirizzo) {
        this.nomeOsp = nomeOsp;
        this.numTel = numTel;
        this.email = email;
        this.indirizzo = indirizzo;
    }

    public String getNomeOsp() {
        return this.nomeOsp;
    }

    public void setNomeOsp(String nomeOsp) {
        this.nomeOsp = nomeOsp;
    }

    public String getNumTel() {
        return this.numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ArrayList<PazienteAmbulatoriale> getPazientiAmbulatoriali() {
        return this.pazientiAmbulatoriali;
    }

    public void setPazientiAmbulatoriali(ArrayList<PazienteAmbulatoriale> pazientiAmbulatoriali) {
        this.pazientiAmbulatoriali = pazientiAmbulatoriali;
    }

    public ArrayList<PazienteRicoverato> getPazientiRicoverati() {
        return this.pazientiRicoverati;
    }

    public void setPazientiRicoverati(ArrayList<PazienteRicoverato> pazientiRicoverati) {
        this.pazientiRicoverati = pazientiRicoverati;
    }
    
    public void aggiungiPazienteRicoverato(Paziente paziente){
        this.pazientiRicoverati.add(paziente);
    }
    
    public PazienteRicoverato ricercaPazienteRicoverato(String codFisc){
        for(int i=0; i<this.pazientiRicoverati.size(); i++){
            PazienteRicoverato pazienteRicoverato = this.pazientiRicoverati(i);
            if (pazienteRicoverato != null && pazientiRicoverati.getCodFisc().equalsIgnoreCase(codFisc)){
                return pazienteRicoverato;
            }
        }
    }
    
     public PazienteAmbulatoriale ricercaPazienteAmbulatoriale (String codFisc){
        for(int i=0; i<this.pazientiAmbulatoriali.size(); i++){
            PazienteAmbulatoriali pazienteAmbulatoriale = this.pazientiAmbulatoriali(i);
            if (pazienteAmbulatoriale != null && pazientiAmbulatoriali.getCodFisc().equalsIgnoreCase(codFisc)){
                return pazienteAmbulatoriale;
            }
        }
    }
     
     public void visualizzaPazienti(){
         System.out.println("Pazienti in ospedale: ");
         for(int x = 0; x < this.pazientiAmbulatoriali.size(); x++){
             Paziente paziente = this.pazienti.get(i);
             System.out.println(pazienti.toString());
         }
     }
}


public String toString(){
    return "/nnome ospedale " + this.nomeOsp + "/ntelefono" + this.numTel + "email" + this.email + "indirizzo" + this.indirizzo;
}
        