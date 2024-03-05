
package progettoveterinario;

public class Animale {
    
    private String nome;
    private int eta;
    private String sesso;

    public Animale(){}
    public Animale(String nome, int eta, String sesso) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSesso() {
        return this.sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    
    
    public String toString(){
        return "/nNome: " + this.nome + "/nEta': " + this.eta + "/nSesso: " + this.sesso;
    }
    
}
