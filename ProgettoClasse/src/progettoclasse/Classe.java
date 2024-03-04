
package progettoclasse;

import java.util.*;
import java.io.*;

public class Classe {
    
    private String nome;
    private ArrayList<Docente> docenti = new ArrayList<Docente>;
    private ArrayList<Studente> studenti = new ArrayList<Studente>;
    
    public Classe(){}

    public Classe(String nome, ArrayList<Docente> docenti, ArrayList<Studente> studenti) {
        this.nome = nome;
        this.docenti = docenti;
        this.studenti = studenti;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void aggiungiDocente(Docente docenti){
        docenti.add(docenti);
    }
    
    public void aggiungiStudente(Studente studenti){
        studenti.add(studenti);
    }
    
    public String toString(){
        return "/nNome classe: " + this.nome;
    }
    
    public void visualizzaClasse{
        System.out.println(docenti.size() + studenti.size());
    }
    
}
