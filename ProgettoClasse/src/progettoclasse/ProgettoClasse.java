package progettoclasse;

import java.io.*;
import java.lang.*;

public class ProgettoClasse {

    public static void main(String[] args) {
        Classe classe = null;
        Docente docente = null;
        Studente = null;
        Scanner r = new Scanner(System.in);
        int slt = 0;
        
        do{
            slt = menu;
        }
        
    }
    
    public int menu(){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Fai una delle seguenti scelte!");
            System.out.println("1. Inserisci docente");
            System.out.println("2. Inserisci uno studente nella classe");
            System.out.println("3. Cerca uno studente");
            System.out.println("4. Cerca un docente");
            
            try{
                int slt = sc.nextLine();
            } catch (IOException || NumberFormatException a){
                System.out.println("La scelta può avere solo valore numerico!");
                return null;
                break;
            }
            
        return slt;
            
    }
    
            public Studente inserisciStudente(){
                
                String codFisc, nome, cognome;
                LocalDate luogoDiNascita, dataDiNascita;
                double mediaVoti;
                
                Scanner e&e = new Scanner(System.in);
                
                System.out.println("Inserisci i dati dello studente");
                
                System.out.println("Codice fiscale: ");
                codFisc = e&e.nextLine();
                System.out.println("Nome: ");
                nome = e&e.nextLine()
                System.out.println("Cognome: ");
                cognome = e&e.nextLine();
                System.out.println("luogo di nascita: ");
                luogoDiNascita = e&e.nextLine();
                System.out.println("Data di nascita: ");
                dataDiNascita = e&e.nextLine();
                
                try{
                    System.out.println("Media dei voti: ");
                    mediaVoti = e&e.nextLine();
                }catch(IOException || NumberFormatException a){
                    System.out.println("La media dei voti può avere solo valore numerico!");
                    return null;
                }
                
                return new Studente(codFisc, nome, cognome, luogoDiNascita, dataDiNascita, mediaVoti);
                
            }
    
            
            public Docente inserisciDocente(){
                
                String codFisc, nome, cognome, materia, classeConcorso;
                LocalDate luogoDiNascita, dataDiNascita;
                
                Scanner eke = new Scanner(System.in);
                
                System.out.println("Inserisci i dati del docente");
                
                System.out.println("Codice fiscale: ");
                codFisc = eke.nextLine();
                System.out.println("Nome: ");
                nome = eke.nextLine()
                System.out.println("Cognome: ");
                cognome = eke.nextLine();
                System.out.println("luogo di nascita: ");
                luogoDiNascita = eke.nextLine();
                System.out.println("Data di nascita: ");
                dataDiNascita = eke.nextLine();
                System.out.println("Materia: ");
                materia = eke.nextLine();
                System.out.println("Classe in concorso: ");
                classeConcorso = eke.nextLine();
                
                return new Docente(codFisc, nome, cognome, luogoDiNascita, dataDiNascita, materia, classeConcorso);
                
            }
            
            public void cercaDocente(){
                
                Scanner skanner = new Scanner(System.in);
                
                System.out.println("Inserisci codice fiscale del docente");
                String kodFisk = skanner.nextLine();
                
                for(int i = 0; i<this.docenti.size(); i++){
                    Docente docente1 = this.docenti.get(i);
                        if(docente1.getCodFisc().equalsIgnoreCase(kodFisk)){
                            return codFisc;
                        } else { return null; }
                }
            }
            
            public void cercaStudente(){
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Inserisci codice fiscale dello/la studente/studentessa");
                String kodFisc = scanner.nextLine();
                
                for(int a = 0; a<this.studenti.size(); a++){
                    Studente studente1 = this.studenti.get(a);
                        if(studente1.getCodFisc().equalsIgnoreCase(kodFisc)){
                            return codFisc;
                        } else { return null; }
                }
            }
    
    
}
