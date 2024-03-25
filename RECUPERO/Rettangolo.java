package progettoformegeometriche;
public class Rettangolo extends FormaGeometrica {
    
    private double latoMag;
    private double latoMin;

    
    
    public Rettangolo(){}

    public Rettangolo(double latoMag, double latoMin, int numLati, int id, String nome) {
        super(numLati, id, nome);
        this.latoMag = latoMag;
        this.latoMin = latoMin;
    }

    
    
    public double getLatoMag() {
        return this.latoMag;
    }

    public void setLatoMag(double latoMag) {
        this.latoMag = latoMag;
    }

    public double getLatoMin() {
        return this.latoMin;
    }

    public void setLatoMin(double latoMin) {
        this.latoMin = latoMin;
    }
    
    
    
    @Override
    public String toString(){
            return "/nDimensioni lato maggiore: " + this.latoMag + "cm" + "/nDimensioni lato minore: " + this.latoMin + "cm";
    }
}
