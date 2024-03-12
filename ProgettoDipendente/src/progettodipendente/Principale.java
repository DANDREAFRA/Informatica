
package progettodipendente;

import java.io.*;
import java.util.*;
import java.time.*;

public class Principale {

    public static void main(String[] args) {
        Progetto progetto = null;
        int slt;
            do{
                switch(slt){
                    case 1: 
                        progetto = creaProgetto();
                        break;
                    case 2:
                        visualizzaProgetto(Progetto);
                        break;
                    case 3:
                        aggiungiDipendente(Progetto);
                        break;
                    case 4:
                        cercaDipendente(Progetto);
                        break;
                    case 0:
                        System.out.println("SYSTEM_SHUTTING_DOWN_");
                        break;
                    default:
                        System.out.println("Scelta errata! La scelta ha valore da 1 a 5");
                        break;
                }
            }while(slt!=0);
        
        
    }
    
    public int menu(){
        Scanner r3 = new Scanner(System.in);
        
        System.out.println("Fai una delle seguenti scelte: ");
        System.out.println("1. Crea un nuovo progetto");
        System.out.println("2. Visualizza dati del progetto");
        System.out.println("3. Aggiungi un dipendente");
        System.out.println("4. Cerca un dipendente");
        
        try{
            int slt = r3.nextInt();
        }catch(IOException || NumberFormatException a){
            System.out.println("La scelta può avere solo valore numerico!");
            return 0;
        }
        
        return slt;
    }
        
    public static Progetto creaProgetto(Progetto progetto){
        Scanner r5 = new Scanner();
        System.out.println("Inserisci i dati del progetto");
        System.out.println("Nome del progetto: ");
        String nomeProg = r5.nextLine();
        System.out.println("Breve descrizione del progetto: ");
        String descrizione = r5.nextLine();
        System.out.println("Inserire i dati del Manager del progetto: ");
        try{        
        System.out.println("Id: ");
        String id = r5.nextLine();
        System.out.println("Nome: ");
        String nome = r5.nextLine();
        System.out.println("Cognome: ");
        String cognome = r5.nextLine();
        System.out.println("Salario: ");
        int salario = r5.nextInt();
        System.out.println("Matricola: ");
        int matricola = r5.nextInt();
        System.out.println("Data di assunzione: ");
        LocalDate assunzione = r5.nextLocalDate();
        Dipendente projManager = new Dipendente(id, nome, cognome, salario, matricola, assunzione);
        }catch(IOException a){
            System.out.println("Dati non inseriti correttamente!");
        }
        
        return new Progetto(projManager, nomeProg, descrizione);
        
    }
    
    public static void visualizzaProgetto(Progetto progetto){
        if(progetto != null){
            System.out.println(progetto.toString());
        }
    }
    
    public static Dipendente aggiungiDipendente(Progetto progetto){
        
        Dipendente dipendente = null;
        Scanner nnn = new Scanner(System.in);
        String id, cognome, nome;
        int matricola, salario;
        LocalDate assunzione;
        System.out.println("Inserire i dati del dipendente");
        try{        
        System.out.println("Id: ");
        String id = r5.nextLine();
        System.out.println("Nome: ");
        String nome = r5.nextLine();
        System.out.println("Cognome: ");
        String cognome = r5.nextLine();
        System.out.println("Salario: ");
        int salario = r5.nextInt();
        System.out.println("Matricola: ");
        int matricola = r5.nextInt();
        System.out.println("Data di assunzione: ");
        LocalDate assunzione = r5.nextLocalDate();
        Dipendente projManager = new Dipendente(id, nome, cognome, salario, matricola, assunzione);
        }catch(IOException a){
            System.out.println("Dati non inseriti correttamente!");
        }
        
        return new Dipendente(id, cognome, nome, salario, matricola, assunzione);
    }
    
    public static void cercaDipendente(Progetto progetto){
        Scanner tk = new Scanner(System.in);
        if(dipendente != null){
            System.out.println("Inserisci l'id del dipendente da cercare");
            String id = tk.nextLine();
            Dipendente dipendenteTrovato = Progetto.ricercaipendente(id);
                if(dipendenteTrovato != null){
                    System.out.println("dipendente trovato: " + dipendenteTrovato.toString());
            } else { System.out.println("Nessun dipendente Trovato! Prova a modificare i parametri di ricerca!"); }
        } else {System.out.println("Non esiste alcun progetto!"); }
    }
        
        
        
    
}
