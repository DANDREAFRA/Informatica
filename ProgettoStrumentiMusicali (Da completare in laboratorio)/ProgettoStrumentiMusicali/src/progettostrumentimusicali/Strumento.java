package progettostrumentimusicali;

public class Strumento {
    private String id;
    private String nome;
    private String tipo;
    private String marca;
    private String modello;
    private double prezzo;
    
    public Strumento(){}

    public Strumento(String id, String nome, String tipo, String marca, String modello, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    @Override
    public String toString(){
        return "/nNome dello strumento: " + this.nome + "/nTipo di strumento: " + this.tipo + "/nMarca: " + this.marca + "/nNumero modello: " + this.modello + "/nPrezzo: " + this.prezzo + "ID: " + this.id;
    }
    
    
    
    
}
