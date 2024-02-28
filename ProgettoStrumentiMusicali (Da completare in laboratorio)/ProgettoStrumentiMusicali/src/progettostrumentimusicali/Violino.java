package progettostrumentimusicali;

public class Violino extends Strumento{
    
    private int numCorde;
    private int annoCostruzione;
    private String archetto;
    
    public Violino(){}

    public Violino(int numCorde, int annoCostruzione, String archetto, String nome, String tipo, String marca, String modello, double prezzo, String id) {
        super(id, nome, tipo, marca, modello, prezzo);
        this.numCorde = numCorde;
        this.annoCostruzione = annoCostruzione;
        this.archetto = archetto;
    }

    public int getNumCorde() {
        return this.numCorde;
    }

    public void setNumCorde(int numCorde) {
        this.numCorde = numCorde;
    }

    public int getAnnoCostruzione() {
        return this.annoCostruzione;
    }

    public void setAnnoCostruzione(int annoCostruzione) {
        this.annoCostruzione = annoCostruzione;
    }

    public String getArchetto() {
        return this.archetto;
    }

    public void setArchetto(String archetto) {
        this.archetto = archetto;
    }
    
    public String toString(){
        return super.toString() + "/nNumero di corde: " + this.numCorde + "/nAnno di costruzione: " + this.
    }
    
}
