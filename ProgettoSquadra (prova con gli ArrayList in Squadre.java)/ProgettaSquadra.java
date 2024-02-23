package progettasquadra;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class ProgettaSquadra {

    public static void main(String[] args) {
        Squadra squadra = null;
        int scelta;
        do {
            scelta = menu();
            switch(scelta) {
                case 1:
                    squadra = creaNuovaSquadra();
                    break;
                case 2:
                    visualizzaDatiSquadra(squadra);
                    break;
                case 3:
                    aggiungiGiocatore(squadra);
                    break;
                case 4:
                    cercaGiocatore(squadra);
                    break;
                case 5:
                    eliminaGiocatore(squadra);
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.\n");
                    break;
                }   
        } while (scelta != 0);
    }

    private static int menu(){
        int scelta; //Variabile di ritorno
        Scanner scanner = new Scanner(System.in); //Per gestire l'input da tastiera 
        System.out.println("Menu:");
        System.out.println("1. Crea nuova squadra");
        System.out.println("2. Visualizza dati squadra");
        System.out.println("3. Aggiungi giocatore");
        System.out.println("4. Cerca giocatore");            
        System.out.println("5. Elimina giocatore");
        System.out.println("0. Esci");
        System.out.print("Scegli un'opzione: ");    
        try {
            scelta = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input non valido. Assicurati di inserire un numero tra 0 e 5.");
            scanner.next(); // Consuma l'input non valido per evitare un loop infinito
            scelta = -1; // Assegna un valore non valido per continuare il loop
        }
        return scelta;
    }
    
      private static Squadra creaNuovaSquadra() {
		  /*La classe Scanner serve a chiedere in input i dati ma in modo più veloce senza il metodo readLine.
			Il metodo next serve invece a leggere la riga di testo successiva e restituirla all'utente. 
			mentre nextLine lascia una riga vuota*/
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i dati della squadra:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Città: ");
        String citta = scanner.nextLine();
        System.out.print("Anno di fondazione: ");
        int annoFondazione = 0;
        try {
            annoFondazione = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Errore nell'inserimento dell'anno di fondazione.");
            return null;
        }  
        scanner.nextLine(); // Consuma il resto della riga
        System.out.print("Campionato: ");
        String campionato = scanner.nextLine();
        System.out.println("Inserisci i dati del primo allenatore:");
        Allenatore primoAllenatore = aggiungiAllenatore(scanner);
        System.out.println("Inserisci i dati del vice allenatore:");
        Allenatore viceAllenatore = aggiungiAllenatore(scanner);

        // Creazione dell'oggetto Squadra con i dati acquisiti
        return new Squadra(nome, citta, annoFondazione, campionato, primoAllenatore, viceAllenatore);
    }

    private static Allenatore aggiungiAllenatore(Scanner scanner) {
        System.out.print("Inserisci il cognome: ");
        String cognome = scanner.next();
        System.out.print("Inserisci il nome: ");
        String nome = scanner.next();
        System.out.print("Inserisci il luogo di nascita: ");
        String luogoDiNascita = scanner.next();
        LocalDate data = chiediData();
        System.out.print("Inserisci la tattica: ");
        String tattica = scanner.next();
        int anniDiEsperienza;
        int titoliVinti;
        try {
            System.out.print("Inserisci gli anni di esperienza: ");
            anniDiEsperienza = scanner.nextInt();
            System.out.print("Inserisci il numero di titoli vinti: ");
            titoliVinti = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Errore nell'inserimento dei dati dell'allenatore.");
            return null;
        }
        return new Allenatore(cognome, nome, luogoDiNascita, data, tattica, anniDiEsperienza, titoliVinti);
    }

    private static void aggiungiGiocatore(Squadra squadra) {
        Scanner scanner = new Scanner(System.in);
        if (squadra != null) {
            System.out.print("Inserisci il cognome del giocatore: ");
            String cognome = scanner.next();
            System.out.print("Inserisci il nome del giocatore: ");
            String nome = scanner.next();
            System.out.print("Inserisci il luogo di nascita: ");
            String luogoDiNascita = scanner.next();
            LocalDate data = chiediData();
            System.out.print("Inserisci il ruolo del giocatore: ");
            String ruolo = scanner.next();
            int numeroMaglia;
            try {
                System.out.print("Inserisci il numero di maglia del giocatore: ");
                numeroMaglia = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Errore nell'inserimento del numero di maglia.");
                return;
            }
            Giocatore nuovoGiocatore = new Giocatore(cognome, nome, luogoDiNascita, data, ruolo, numeroMaglia);
            squadra.aggiungiGiocatore(nuovoGiocatore);
        } else {
            System.out.println("Prima di aggiungere un giocatore, crea una nuova squadra.");
        }
    }

    private static void cercaGiocatore(Squadra squadra) {
        Scanner scanner = new Scanner(System.in);
        if (squadra != null) {
            System.out.print("Inserisci il cognome del giocatore da cercare: ");
            String cognome = scanner.next();
            System.out.print("Inserisci il nome del giocatore da cercare: ");
            String nome = scanner.next();
            Giocatore giocatoreTrovato = squadra.ricercaGiocatore(cognome, nome);
            if (giocatoreTrovato != null) {
                System.out.println("Giocatore trovato: " + giocatoreTrovato.toString());
            } else {
                System.out.println("Giocatore non trovato.");
            }
        } else {
            System.out.println("Non è stata creata alcuna squadra.");
        }
    }

    private static void eliminaGiocatore(Squadra squadra) {
        Scanner scanner = new Scanner(System.in);
        if (squadra != null) {
            System.out.print("Inserisci il cognome del giocatore da eliminare: ");
            String cognome = scanner.next();
            System.out.print("Inserisci il nome del giocatore da eliminare: ");
            String nome = scanner.next();
            squadra.cancellaGiocatore(cognome, nome);
        } else {
            System.out.println("Non è stata creata alcuna squadra.");
        }
    }

    private static void visualizzaDatiSquadra(Squadra squadra) {
        if(squadra != null){
            System.out.println(squadra.toString());
        } else {
            System.out.println("Nessuna squadra presente");
        }
    }
    
    private static LocalDate chiediData() {
        Scanner scanner = new Scanner(System.in);
        LocalDate data = null;
        boolean formatoCorretto = false;
        while (!formatoCorretto) {
            System.out.print("Inserisci la data di nascita (formato yyyy-MM-dd): ");
            String dataString = scanner.nextLine();
            try {
                // Prova a convertire la stringa in LocalDate
                data = LocalDate.parse(dataString);
                formatoCorretto = true; // Se non viene lanciata eccezione, il formato è corretto
            } catch (Exception e) {
                System.out.println("Formato data non valido. Inserisci nuovamente.");
            }
        }
        return data;
    }
}


