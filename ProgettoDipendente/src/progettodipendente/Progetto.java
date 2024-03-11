package progettodipendente;

import java.util.ArrayList;

public class Progetto {
    
    private Dipendente projManager;
    private ArrayList<Dipendente> team = new ArrayList();
    private String nomeProg;
    private String descrizione;

    public Progetto(){}
    
    
    
    public Progetto(Dipendente projManager, String nomeProg, String descrizione) {
        this.projManager = projManager;
        this.nomeProg = nomeProg;
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public Dipendente getProjManager() {
        return this.projManager;
    }

    public void setProjManager(Dipendente projManager) {
        this.projManager = projManager;
    }

    public String getNomeProg() {
        return this.nomeProg;
    }

    public void setNomeProg(String nomeProg) {
        this.nomeProg = nomeProg;
    }
    
    @Override
    public String toString(){
        return "/nNome del progetto: " + this.nomeProg + "/nManager del progetto: " + this.projManager + "/nBreve descrizione del progetto: " + this.descrizione;
    }
    
    public Dipendente ricercaAnimale(String id){
         for(int x = 0; x<this.team.size(); x++){
             Dipendente dipendente = this.team.get(x);
             if(dipendente != null && dipendente.getId().equalsIgnoreCase(id)){
                 return dipendente;
             } else { return null; }
         }
    }
    
    
    
    
    
}

