
package progettoveterinario;

public class Cane extends Animale {
    
    private String razza;
    private String taglia;

    public Cane(){}

    public Cane(String razza, String taglia, String nome, int eta, String sesso) {
        super(nome, eta, sesso);
        this.razza = razza;
        this.taglia = taglia;
    }

    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getTaglia() {
        return this.taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }
    
    public String toString(){
        return super.toString() + "/nRazza: " + this.razza + "/nTaglia: " + this.taglia;
    }
    
    
}
