package progettoUfficio;

public class Dirigente extends Dipendente {

    private int anniDiIncarico;

    public Dirigente{}
    
    public Dirigente(String nome, String cognome, int anniDiIncarico) {
        super(nome, cognome);
        this.anniDiIncarico = anniDiIncarico;
    }

    public int getAnniDiIncarico() {
        return anniDiIncarico;
    }

    public void setAnniDiIncarico(int anniDiIncarico) {
        this.anniDiIncarico = anniDiIncarico;
    }
    
    public String toString(){
        
        return "Nome: " + this.nome + "Cognome: " + this.cognome + "Anni di incarico: " + this.anniDiIncarico;
    }
            
}
