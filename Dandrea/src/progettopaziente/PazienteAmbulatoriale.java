package progettopaziente;

public class PazienteAmbulatoriale extends Paziente {
    
    private boolean necessita;
    private String codicePriorita;

    public PazienteAmbulatoriale(){}

    public PazienteAmbulatoriale(boolean necessita, String codicePriorita, String nome, String cognome, String dataNascita, String codFisc) {
        super(nome, cognome, dataNascita, codFisc);

        this.necessita = necessita;
        this.codicePriorita = codicePriorita;
    }

    public boolean isNecessita() {
        return this.necessita;
    }

    public void setNecessita(boolean necessita) {
        this.necessita = necessita;
    }

    public String getCodicePriorita() {
        return this.codicePriorita;
    }

    public void setCodicePriorita(String codicePriorita) {
        this.codicePriorita = codicePriorita;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + "/nNecessita di intervento immediato? " + this.necessita + "/nCodice di priorita': " + this.codicePriorita;
    }
    
    
}
