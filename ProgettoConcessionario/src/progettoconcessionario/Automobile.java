package progettoconcessionario;
        
public class Automobile extends Veicolo {
    
    private int numPorte;
    private int numCavalli;
    private String colore;

    public Automobile(){}
    
    public Automobile(int numPorte, int numCavalli, String colore, String targa, String marca, String modello, float prezzo) {
        super(targa, marca, modello, prezzo);
        this.numPorte = numPorte;
        this.numCavalli = numCavalli;
        this.colore = colore;
    }

    public int getNumPorte() {
        return this.numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    public int getNumCavalli() {
        return this.numCavalli;
    }

    public void setNumCavalli(int numCavalli) {
        this.numCavalli = numCavalli;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    
    @Override
    public String toString(){
        return super.toString() + "/nNumero di porte: " + this.numPorte + "/nNumero di cavalli: " + this.numCavalli + "Colore dell'auto: " + this.colore;                                                                                             
    }
    
}
