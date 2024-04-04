package progettopaziente;

public class PazienteRicoverato extends Paziente {
    private boolean stabile;
    private String dataRicovero;
    private String causaRicovero;
    private String reparto;

    public PazienteRicoverato(){}
    
    public PazienteRicoverato(boolean stabile, String dataRicovero, String causaRicovero, String reparto, String nome, String cognome, String dataNascita, String codFisc) {
        super(nome, cognome, dataNascita, codFisc);
        this.stabile = stabile;
        this.dataRicovero = dataRicovero;
        this.causaRicovero = causaRicovero;
        this.reparto = reparto;
    }

    public boolean isStabile() {
        return this.stabile;
    }

    public void setStabile(boolean stabile) {
        this.stabile = stabile;
    }

    public String getDataRicovero() {
        return this.dataRicovero;
    }

    public void setDataRicovero(String dataRicovero) {
        this.dataRicovero = dataRicovero;
    }

    public String getCausaRicovero() {
        return this.causaRicovero;
    }

    public void setCausaRicovero(String causaRicovero) {
        this.causaRicovero = causaRicovero;
    }
    
    @Override
    public String toString(){
        return super.toString() + "/nPaziente in condizioni di stabilita': " + this.stabile + "/nData di ricovero: " + this.dataRicovero + "/nCausa del ricovero: " + this.causaRicovero + "/nReparto in cui e' ricoverato: " + this.reparto;
    }
    
}
