package progettoformegeometriche;

import java.util.ArrayList;

public class FormaGeometrica {
    //Attributes
    private int numLati;
    private int id;
    private String nome;
    //Constructor
    
    public FormaGeometrica(){}
    
    public FormaGeometrica(int numLati, int id, String nome) {
        this.numLati = numLati;
        this.id = id;
        this.nome = nome;
    }

    //Setter and Getter
    public int getNumLati() {
        return this.numLati;
    }

    public void setNumLati(int numLati) {
        this.numLati = numLati;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "/nNumero di lati: " + this.numLati + "/nID (numerico): " + this.id + "/nNome: " + this.nome;
    }
    
    
}
