
package progettoveterinario;

import java.io.*;
import java.util.*;

public class ProgettoVeterinario {

    public static void main(String[] args) {
        StudioVeterinario studioVeterinario ) null;
        int slt;
            do{
                slt = menu;
                switch(slt){
                    case 1: 
                        studioVeterinario = creaNuovoStudio();
                    break;
                    case 2: 
                         visualizzaDati(studioVeterinario);
                    break;
                     case 3:
                        aggiungiAnimale(studioVeterinario);
                    break;
                    case 4:
                        ricercaAnimale(studioVeterinario);
                    break;
                    case 0:
                        System.out.println("SYSTEM_SHUTTING_DOWN:_");
                    break;
                    default:
                        System.out.println("La scelota ha valore solo da 0 a 4!)");
                    break;
                }
            }while(slt!=0);
    }
    
    public int menu(){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Fai una delle seguenti scelte!");
            System.out.println("1. Crea uno studio animale");
            System.out.println("2. Visualizza dati studio");
            System.out.println("3. Inserisci un cane");
            System.out.println("4. Cerca un animale");;
            System.out.println("...Premi 0 per uscire");
            
            try{
                int slt = sc.nextInt();
            } catch (IOException || NumberFormatException a){
                System.out.println("La scelta può avere solo valore numerico!");
                return null;
                break;
            }
            
        return slt;
            
    }
    
    public void aggiungiAnimale(StudioVeterinario studioVeterinario){
        Scanner skanner = new Scanner(System.in);
        if(studioVeterinario != null){
                System.out.println("Premi 1 per aggiungere un cane, 2 per una tartaruga...");
                int sct = skanner.nextInt();
                skanner.nextLine();
                switch(sct){
                    case 1:
                        Cane cane = creaCane();
                            if(cane != null){
                                studioVeterinario.aggiungiAnimale(cane);
                            }
                    break;
                    case 2:
                        Tartaruga tartaruga = creaTartaruga();
                            if(tartaruga != null){
                                studioVeterinario.aggiungiAnimale(tartaruga);
                            }
                    break;
                    default:
                        System.out.println("Scelta errata!");
                    break;  
                }
        }
    }   

    public static Cane creaCane(){

        Scanner s = new Scanner(System.in);
             Cane cane = null;
            int id, eta;
            String nome, sesso, razza, taglia;
                try{
                    System.out.println("ID: ");
                    id = s.nextInt();
                    System.out.println("Eta': ");
                    eta = s.nextInt();
                    System.out.println("Nome: ");
                    nome = s.nextLine();
                    System.out.println("Sesso: ");
                    sesso = s.nextLine();
                    System.out.println("taglia: ");
                    taglia = s.nextLine();
                    System.out.println("Razza: ");
                    razza = s.nextLine();
                }catch(IOException a){
                    System.out.println("Errore in input!");
                }
        return new Cane(id, eta, nome, sesso, razza, taglia);
    }

    public static Tartaruga creaTartaruga(){

        Scanner s = new Scanner(System.in);
             Tartaruga tartaruga = null;
            int id, eta;
            String nome, sesso, specie, tipoCarapace;
                try{
                    System.out.println("ID: ");
                    id = s.nextInt();
                    System.out.println("Eta': ");
                    eta = s.nextInt();
                    System.out.println("Nome: ");
                    nome = s.nextLine();
                    System.out.println("Sesso: ");
                    sesso = s.nextLine();
                    System.out.println("tipo di carapace: ");
                    tipoCarapace = s.nextLine();
                    System.out.println("specie: ");
                    specie = s.nextLine();
                }catch(IOException a){
                    System.out.println("Errore in input!");
                }
        return new Tartaruga(id, eta, nome, sesso, tipoCarapace, specie);
    }

    public static StudioVeterinario creaNuovoStudio(){
        Scanner a = new Scanner(System.in);
        System.out.println("Inserisci i dati dello studio: ");
        System.out.println("Nome: ");
        String nome = a.nextLine();
        System.out.println("Indirizzo: ");
        String indirizzo = a.nextLine();
        System.out.println("Numero di telefono: ");
        String telefono = a.nextLine();
        System.out.println("Email: ");
        String mail = a.nextLine();
        System.out.println("Assistenza: ");
        boolean assistenza = a.nextBoolean();
        
        return new StudioVeterinario(nome, indirizzo, telefono, mail, assistenza);

    }
       
    public static void cercaAnimale(StudioVeterinario studioVeterinario){
        Scanner tk = new Scanner(System.in);
        if(studioVeterinario != null){
            System.out.println("Inserisci l'id dell'animale da cercare");
            String id = tk.nextLine();
            Animale animaleTrovato = studioVeterinario.ricercaAnimale(id);
                if(animaleTrovato != null){
                    System.out.println("animale trovato: " + animaleTrovato.toString());
            } else { System.out.println("Nessun animale Trovato! Prova a modificare i parametri di ricerca!"); }
        } else {System.out.println("Non esiste alcuno studio veterinario :( ") }
    }
    
    public static void visualizzaDati(StudioVeterinario studioVeterinario){
        if(studioVeterinario != null){
            System.out.println(studioVeterinario.toString());
        }
    }
    
}