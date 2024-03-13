package progettogiocattoli;

public class Trenino extends Giocattoli {
    
    private boolean elettrico;
    private String dimensioni;

    public Trenino() {}

    public Trenino(boolean elettrico, String nome, float prezzo, String materialeProduzione, String classificazionePerEta, String fabbrica, String dimensioni) {
        super(nome, prezzo, materialeProduzione, classificazionePerEta, fabbrica);
        this.elettrico = elettrico;
        this.dimensioni = dimensioni;
    }

    public boolean isElettrico() {
        return elettrico;
    }

    public void setElettrico(boolean elettrico) {
        this.elettrico = elettrico;
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }
    
    @Override
    public String toString(){
        return super.toString() + "/nElettrico? " + this.elettrico + "/nDimensioni: " + this.dimensioni;
    }
    
}
