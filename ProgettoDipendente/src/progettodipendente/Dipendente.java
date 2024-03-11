package progettodipendente;

import java.time.LocalDate;


public class Dipendente {

    private String id;
    private String cognome;
    private String nome;
    private int salario;
    private int matricola;
    private LocalDate assunzione;

    public Dipendente(){}
    
    public Dipendente(String id, String cognome, String nome, int salario, int matricola, LocalDate assunzione) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.salario = salario;
        this.matricola = matricola;
        this.assunzione = assunzione;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public LocalDate getAssunzione() {
        return this.assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
    }
    
    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getMatricola() {
        return this.matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "/nId: " + this.id + "/nNome: " + this.nome + "/nCognome: " + this.cognome + "/nsalario: " + this.salario + "Numero matricola: " + this.matricola + "Data di assunzione: " + this.assunzione;
    }
    
    
    
    
    
}
