
package progettoclasse;

import java.io.*;
import java.time.*;

public class Studente extends Persona {
    
    private double mediaVoti;

    public Studente(){}
    
    public Studente(String codFisc, String nome, String cognome, LocalDate dataDiNascita, LocalDate luogoDiNascita, double mediaVoti) {
        super(codFisc, cognome, nome, luogoDiNascita, dataDiNascita);
        this.mediaVoti = mediaVoti;
    }

    public double getMediaVoti() {
        return this.mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }
    
    public String toString(){
        return super.toString() +m "/nMedia dei voti: " + this.mediaVoti;
    }
    
    
    
    
}
