package progettogiocattoli;

public class Giocattoli {
    
    private String nome;
    private float prezzo;
    private String materialeProduzione;
    private String classificazionePerEta;
    private String fabbrica;

    //costruttore
    
    public Giocattoli(){}
    
    public Giocattoli(String nome, float prezzo, String materialeProduzione, String classificazionePerEta, String fabbrica) {
        this.classificazionePerEta = classificazionePerEta;
        this.nome = nome;
        this.prezzo = prezzo;
        this.materialeProduzione = materialeProduzione;
        this.fabbrica = fabbrica;
    }

    //set e get

    public String getFabbrica() {
        return this.fabbrica;
    }

    public void setFabbrica(String fabbrica) {
        this.fabbrica = fabbrica;
    }
    
    public String getClassificazionePerEta() {
        return this.classificazionePerEta;
    }

    public void setClassificazionePerEta(String classificazionePerEta) {
        this.classificazionePerEta = classificazionePerEta;
    }
        
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getMaterialeProduzione() {
        return this.materialeProduzione;
    }

    public void setMaterialeProduzione(String materialeProduzione) {
        this.materialeProduzione = materialeProduzione;
    }
    
    //tostring
    
    public String toString(){
        return "/nNome del giocattolo: " + this.nome + "/nPrezzo: " + this.prezzo + "/nMateriale con cui e' stato prodotto: " + this.materialeProduzione + "/nClassificazione per eta': " + this.classificazionePerEta + "/nFabbrica: " + this.fabbrica;
    }
    
}
    
   