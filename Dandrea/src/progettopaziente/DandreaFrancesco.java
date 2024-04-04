
package progettopaziente;

import java.util.*;
import java.io.*;
import java.lang.NumberFormatException;

public class DandreaFrancesco {
    public static void main(String[] args){
        Ospedale ospedale = null;
        int scelta = 0;
        do{
            scelta = menu();
                switch(scelta){
                    case 1:
                        ospedale = creaOspedale();
                    break;
                    case 2:
                        aggiungiPaziente(ospedale);
                    break;
                    case 0:
                        System.out.println("SYSTEM-SHUTTING-DOWN");
                    default:
                        System.out.println("Scelta errata e/o non esistente! Prova a scegliere tra 0 e 5!");
                    break;
                        
                }
        }while(scelta!=0);
        
    }

    private static int menu() {
        System.out.println("Fai una di queste scelte!");
        System.out.println("1. Crea un ospedale");
        System.out.println("2. Aggiungi un paziente");
        System.out.println("3. Visualizza i dati dell'ospedale");
        System.out.println("4. cerca un paziente in base al suo codice fiscale");
        System.out.println("... e premi 0 per uscire.");
        
        Scanner skanner = new Scanner(System.in);
        //try{
            int scelta = skanner.nextInt();
        /*}catch(IOException || NumberFormatException a){
            System.out.println("La scelta ha solo valore numerico.");
            return null;
        }*/
        return scelta;
    }
        

    
    private static void aggiungiPaziente(){
        Scanner k = new Scanner(System.in);
        System.out.println("Premi 1 per inserire un paziente ambulatoriale, 2 per un paziente ricoverato");
        int scelta2 = k.nextInt();
            switch(scelta2){
                case 1:
                    aggiungiPazienteAmbulatoriale(ospedale);
                break;
                case 2:
                    aggiungiPazienteRicoverato(ospedale);
                break;
                default:
                    System.out.println("Errore in input");
                break;
            }
    }
    
    
    
    
    
    
    
    
    
    private static Ospedale creaOspedale() {
        String nomeOsp = "", numTel = "", email = "", indirizzo = "";
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Inserisci il nome dell'ospedale");
            nomeOsp = scanner.nextLine();
            System.out.println("Inserisci il numero di telefono dell'ospedale");
            numTel = scanner.nextLine();
            System.out.println("Inserisci l'indirizzo email del progetto: ");
            email = scanner.nextLine();
            System.out.println("Inserisci l'indirizzo civico: ");
            indirizzo = scanner.nextLine();
        }catch(Exception x){
            System.out.println("Errore in input!");
            return null;
        }
        
            return new Ospedale(nomeOsp, numTel, email, indirizzo);
            
    }

    private static PazienteAmbulatoriale aggiungiPazienteAmbulatoriale(Ospedale ospedale) {
        Scanner skanner = new Scanner(System.in);
                 try{
                     System.out.println("Inserisci i dati del paziente ambulatoriale");
                     System.out.println("Inserire il nome del paziente");
                     String nome = skanner.nextLine();
                     System.out.println("Inserisci i, cognome del paziente");
                     String cognome = skanner.nextLine();
                     System.out.println("Inserisci la data di nascita del paziente");
                     String dataNascita = skanner.nextLine();
                     System.out.println("Inserisci il codice fiscale");
                     String codFisc = skanner.nextLine();
                     System.out.println("Il paziente necessita di intervento immediato?");
                     boolean necessita = skanner.nextBoolean();
                     System.out.println("inserire il codice priorita' (esempio: rosso se il paziente e' grave, verde se stabile, blu se il problema e' minimo)");
                     String codicePriorita = skanner.nextLine();
                 }catch(Exception a){
                     System.out.println("Errore nell'inserimento dei dati");
                     return null;
                 }
                 return new PazienteAmbulatoriale(necessita, codicePriorita, nome, cognome, dataNascita, codfisc);

    }
       
    private static PazienteRicoverato aggiungiPazienteRicoverato(Ospedale ospedale) {
        Scanner skanner = new Scanner(System.in);
                 try{
                     System.out.println("Inserisci i dati del paziente da ricoverare");
                     System.out.println("Inserire il nome del paziente");
                     String nome = skanner.nextLine();
                     System.out.println("Inserisci i, cognome del paziente");
                     String cognome = skanner.nextLine();
                     System.out.println("Inserisci la data di nascita del paziente");
                     String dataNascita = skanner.nextLine();
                     System.out.println("Inserisci il codice fiscale");
                     String codFisc = skanner.nextLine();
                     System.out.println("Il paziente e' al momento stabile?");
                     boolean stabile = skanner.nextBoolean();
                     System.out.println("Inserisci la data del ricovero");
                     String dataRicovero = skanner.nextLine();
                     System.out.println("Inserisci la causa del ricovero");
                     String causaRicovero = skanner.nextLine();
                     System.out.println("Inserisci il reparto");
                     String reparto = skanner.nextLine();
                 }catch(Exception a){
                     System.out.println("Errore nell'inserimento dei dati");
                     return null;
                 }
                 return new PazienteRicoverato(stabile, dataRicovero, causaRicovero, reparto, nome, cognome, dataNascita, codfisc);

    }
        
    private static void cercaPaziente(Ospedale ospedale){
        Sccanner eee = new Scanner(System.in);
        if(ospedale != null){
            System.out.println("Inserisci il codice fiscale");
            String codFisc = eee.nextLine();
            Paziente pazienteTrovato = ospedale.ricerca
        }
            
        
    }
}

