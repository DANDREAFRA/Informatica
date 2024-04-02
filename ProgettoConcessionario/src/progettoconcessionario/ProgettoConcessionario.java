package progettoconcessionario;

import java.util.*;
import java.io.*;
public class ProgettoConcessionario {

    public static void main(String[] args) {
        ProgettoVeicoli concessionario;
        int s;
        
        do{
            s = mn();
            switch(s){
                case 1:
                    concessionario = creaNuovoConcessionario;
                break;
                case 2:
                    visualizzaConcessionario(concessionario);
                break;
                case 3:
                    aggiungiAutomobile(concessionario);
                break;
                case 4:
                    cercaVeicolo(concessionario);
                break;
                case 0:
                    System.out.println("PROGRAM: SHUTDOWN_");
                break;
                default:
                    System.out.println("Non esiste questo caso");
                break;
            }
        }while(s != 0);
    }
    
    private static int mn(){
        int s;
        Scanner r = new Scanner(System.in);
        System.out.println("Fai una di queste scelte!");
        System.out.println("1. Crea un nuovo negozio concessionario");
        System.out.println("2. Visualizza i dati del concessionario");
        System.out.println("3. Aggiungi un automobile");
        System.out.println("4. Cerca un veicolo");
        System.out.println("...E premi (ovviamente) 0 per uscire");
        try{
            s = r.nextInt();
        }catch(IOException || NumberFormatException a){
            System.out.println("La scelta ha valore solo in formato numerico!");
            return null;
        }
        return s;
    }
        
  
    public static ProgettoVeicoli creaNuovoConcessionario(){
        Scanner k = new Scanner(System.in);
        System.out.println("Inserisci i dati del concessionartio");
        System.out.println("Inserisci il nome");
        String nome = k.nextLine();
        System.out.println("Inserisci l'indirizzo civico");
        String indirizzo = k.nextLine();
        System.out.println("Inserisci l'indirizzo email");
        String email = k.nextLine();
        System.out.println("Inserisci numero di telefono");
        String numTel = k.nextLine();
        return new ProgettoVeicoli(nome, indirizzo, email, numTel);
    }
    
    public static Automobile aggiungiAutomobile(ProgettoVeicoli concessionario){
        Scanner rv2;
        if(concessionario != null){
            try{
                System.out.println("Inserisci i dati della macchina");
                System.out.println("Numero di porte: ");
                int numPorte = rv2.nextInt();
                System.out.println("Potenza (Espressa in cavalli)");
                int numCavalli = rv2.nextInt();
                System.out.println("Colore dell'auto: ");
                String colore = rv2.nextLine();
                System.out.println("Numero din targa:");
                String targa = rv2.nextLine();
                System.out.println("Marca: ");
                String marca = rv2.nextLine();
                System.out.println("Modello: ");
                String modello = rv2.nextLine();
                System.out.println("Prezzo: ");
                float prezzo = rv2.nextFloat();
            }catch(IOException a){
                return null;
                System.out.println("Inserimento errato dei dati");
            }
            
            return Automobile automobile = new Automobile(numPorte, numCavalli, colore, targa, marca, modello, prezzo);
            
            
        }
        
    }
    
    private static void cercaVeicolo(ProgettoVeicoli concessionario){
        Scanner rv3 = new Scanner(System.in);
        if(concessionario != null){
            System.out.println("Inserisci la targa del veicolo da cercare");
            String targa = rv3.nextLine();
            Veicolo veicoloTrovato = concessionario.ricercaVeicolo(targa);
            if(veicoloTrovato != null){
                System.out.println("Veicolo trovato: " + veicoloTtovato.toString());
            }
        }
    }
    
    
}
