
package progettoclasse;

import java.time.*;
import java.io.*;

public class Docente extends Persona {
    
    private String classeConcorso;
    private String materia;

    
    public Docente(){}

    public Docente(String codFisc, Stringcognome, String nome, String luogoDiNascita, LocalDate dataDiNascita, String classeConcorso, String materia) {
        super(codFisc, cognome, nome, luogoDiNascita, dataDiNascita);
        this.classeConcorso = classeConcorso;
        this.materia = materia;
    }
    
   

    public String getClasseConcorso() {
        return this.classeConcorso;
    }

    public void setClasseConcorso(String classeConcorso) {
        this.classeConcorso = classeConcorso;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public String toString(){
        return super.toString() + "/nClasse in concorso: " + this.classeConcorso + "/nMateria: " + this.materia;
    }
    
}
