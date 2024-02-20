package progettoufficio;

import java.time.LocalDate;


public class Dipendente {

    private String cognome;
    private String nome;
    private int salario;
    private int matricola;
    private LocalDate assunzione;

    public Dipendente(){}
    
    public Dipendente(String cognome, String nome, int salario, int matricola, LocalDate assunzione) {
        this.cognome = cognome;
        this.nome = nome;
        this.salario = salario;
        this.matricola = matricola;
        this.assunzione = assunzione;
    }
    
    
    public LocalDate getAssunzione() {
        return assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
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
        return "/nNome: " + this.nome + "/nCognome: " + this.cognome + "/nsalario: " + this.salario + "Numero matricola: " + this.matricola + "Data di assunzione: " + this.assunzione;
    }
    
    
    
    
    
}
