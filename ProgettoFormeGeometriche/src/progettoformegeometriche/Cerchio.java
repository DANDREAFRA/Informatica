package progettoformegeometriche;

public class Cerchio extends FormaGeometrica {

    private double raggio;
    
    
    public Cerchio(){}
    
    public Cerchio(double raggio, int numLati, int id, String nome) {
        super(numLati, id, nome);
        this.raggio = raggio;
    }
    
    
    public void setRaggio(double raggio){
        this.raggio = raggio;
    }
    
    public double getRaggio(){
        return this.raggio;
    }
    
    
    @Override
    public String toString(){
        return "/nDimensioni del raggio: " + this.raggio + "cm";
    }
    
    
    
}
