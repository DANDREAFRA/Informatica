package progettogiocattoli;

public class Costruzioni extends Giocattoli {
   private int numPezzi;
   private String colori;

    public Costruzioni() {}

    public Costruzioni(int numPezzi, String colori, String nome, float prezzo, String materialeProduzione, String classificazionePerEta, String fabbrica) {
        super(nome, prezzo, materialeProduzione, classificazionePerEta, fabbrica);
        this.numPezzi = numPezzi;
        this.colori = colori;
    }

    public int getNumPezzi() {
        return this.numPezzi;
    }

    public void setNumPezzi(int numPezzi) {
        this.numPezzi = numPezzi;
    }

    public String getColori() {
        return colori;
    }

    public void setColori(String colori) {
        this.colori = colori;
    }
    
   @Override
    public String toString(){
        return super.toString() + "/nNumero di pezzi: " +this.numPezzi + "/nColori: " + this.colori;
    }
   
}


