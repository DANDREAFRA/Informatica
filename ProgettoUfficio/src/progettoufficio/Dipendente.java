package progettoufficio;


public class Dipendente {

    private String cognome;
    private String nome;
    private int salario;
    private int matricola;

    
    public Dipendente(){}
    
    public Dipendente(String cognome, String nome, int salario, int matricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.salario = salario;
        this.matricola = matricola;
    }
    
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "/nNome: " + nome + "/nCognome: " + cognome + ", nome="  ", salario=" + salario + ", matricola=" + matricola + '}';
    }
    
    
    
    
    
}
