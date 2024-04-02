package progettoconcessionario;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private float prezzo;

    public Veicolo(){}
    
    public Veicolo(String targa, String marca, String modello, float prezzo) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getTarga() {
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return this.modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    
    @Override
    public String toString(){
        return "/nNumero di targa: " + this.targa + "Marca: " + this.marca + "Modello: " + this.modello + "Prezzo: " + this.prezzo;
    }
    
    
}
