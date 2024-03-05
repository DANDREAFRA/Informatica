
package progettoveterinario;

public class Tartaruga extends Animale {
    
    private String specie;
    private String tipoCarapace;

    public Tartaruga(){}

    public Tartaruga(String specie, String tipoCarapace, String nome, int eta, String sesso) {
        super(nome, eta, sesso);
        this.specie = specie;
        this.tipoCarapace = tipoCarapace;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getTipoCarapace() {
        return tipoCarapace;
    }

    public void setTipoCarapace(String tipoCarapace) {
        this.tipoCarapace = tipoCarapace;
    }
    
    public String toString(){
        return super.toString() + "/nSpecie: " + this.specie + "/nTipo di carapace: " + this.tipoCarapace;
    }
    
}
