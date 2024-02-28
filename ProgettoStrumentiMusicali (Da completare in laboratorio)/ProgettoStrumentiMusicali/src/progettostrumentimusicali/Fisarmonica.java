package progettostrumentimusicali;

public class Fisarmonica extends Strumento {
    
    private int numBassi;
    private String tonalita;

    public Fisarmonica(){}
    
    public Fisarmonica(int numBassi, String tonalita, String nome, String tipo, String marca, String modello, double prezzo, String id) {
        super(id, nome, tipo, marca, modello, prezzo);
        this.numBassi = numBassi;
        this.tonalita = tonalita;
    }

    public int getNumBassi() {
        return numBassi;
    }

    public void setNumBassi(int numBassi) {
        this.numBassi = numBassi;
    }

    public String getTonalita() {
        return tonalita;
    }

    public void setTonalita(String tonalita) {
        this.tonalita = tonalita;
    }
    
    public void toString(){
        return super.toString() + "/nNumero di bassi: " + this.numBassi + "/nTonalita: " + this.tonalita;
        
    }
    
    
}
