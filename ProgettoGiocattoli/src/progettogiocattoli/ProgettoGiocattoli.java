package progettogiocattoli;

import java.io.*;
import java.lang*;
import java.util.*;


public class ProgettoGiocattoli {

    public static void main(String[] args) {
		Negozio negozio = null;
		Giocattoli giocattolo = null;
		int slt = 0;
		Scanner k = new Scanner(System.in);
		
			do{
				slt = mn();
					switch(slt){
						case 1:
							negozio = creaNegozio();
						break;
						
						case 2:
							visualizzaNegozio(negozio);
						break;
						
						case 3:
							aggiungiGiocattolo(negozio);
						break;
						
						case 4:
							cercaGiocattolo(negozio);
						break;
						
						case 0:
							System.out.println("SYSTEM_SHUTTING_DOWN");
						break;
						default:
							System.out.println("Citazione dal maestro Oogway di kung fu panda: 'Il caso non esiste' (Fatta eccezione da 0 a 4)");
						break;
					}
			}while(slt != 0);
							  
    }
    
	public int mn(){
		
		Scanner scanacs = new Scanner(System.in);
		
			System.out.println("Fai una tra le seguenti scelte");
			System.out.println("1. Crea un negozio");
			System.out.println("2. Visualizza il negozio (e i vari articoli)");
			System.out.println("3. Aggiungi un giocattolo nel negozio");
			System.out.println("4. Cerca un giocattolo in base al nome ");
			System.out.println("...e premi 0 per uscire");
	
		try{
		int slt = scanacs.nextInt();
		}catch(IOException || NumberFormatException a){
			System.out.println("La scelta può essere scritta solo in formato numerico");
			return null;
		}
		return slt;
	}
	
	
	public Negozio creaNegozio(){
        
		String nomeNeg, indirizzo, telefono, mail;

		
		
            Scanner rennacs = new Scanner(System.in);
			System.out.println("Inserire i dati del negozio");
			
		do{
			try{ 
				System.out.println("Nome: ");
				nomeNeg = rennacs.nextLine();
				System.out.println("Indirizzo/via: ");
				indirizzo = rennacs.nextLine();
				System.out.println("Numero di telefono: ");
				telefono = rennacs.nextLine();
				System.out.println("Indirizzo mail: ");
				mail = rennacs.nextLine();
			}catch(Exception a){}
		} while(nomeNeg.isEmpty() || indirizzo.isEmpty() || telefono.isEmpty() || mail.isEmpty()); 
		
		return new Negozio(nomeNeg, indirizzo, telefono, mail);
		
    }
	
	public void aggiungiGiocattolo(Negozio negozio){
		
		String nome, materialeProduzione, classificazionePerEta, fabbrica, dimensioni, colori;
		float prezzo;
		int numPezzi;
		boolean elettrico;
		
		System.out.println("Premi 1 per aggiungere delle costruzioni, premi 2 per aggiungere un trenino");
		
			Scanner t = new Scanner(System.in);
			int s2 = t.nextInt();
			
				switch(s2){
					case 1:
						try{
						System.out.println("Nome: ");
						nome = t.nextLine();
						System.out.println("Materiale con cui e' stato prodotto: ");
						materialeProduzione = t.nextLine();
						System.out.println("Eta' consigliata: ");
						classificazionePerEta = s2.nextLine();
						System.out.println("Fabbrica da cui è stato prodotto: ");
						fabbrica = t.nextLine();
						System.out.println("Prezzo: ");
						prezzo = t.nextLine();
						System.out.println("Colorazioni: ");
						colori = t.nextLine();
						System.out.println("Numero di pezzi: ");
						numPezzi = t.nextInt();
						}catch(IOException a){
							System.out.println("Errore nell'input!");
							return null;
						}
		
						return new Costruzioni(nome, materialeProduzione, classificazionePerEta, fabbrica, prezzo, colori, numPezzi);
					
					break;
					
					case 2:
						try{
						System.out.println("Nome: ");
						nome = t.nextLine();
						System.out.println("Materiale con cui e' stato prodotto: ");
						materialeProduzione = t.nextLine();
						System.out.println("Eta' consigliata: ");
						classificazionePerEta = s2.nextLine();
						System.out.println("Fabbrica da cui è stato prodotto: ");
						fabbrica = t.nextLine();
						System.out.println("Prezzo: ");
						prezzo = t.nextLine();
						System.out.println("Dimensioni: ");
						dimensioni = t.nextLine();
						System.out.println("Elettrico?");
						elettrico = t.nextBoole();
						}catch(IOException a){
							System.out.println("Errore nell'input!");
							return null;
						}
						
						return new Trenino(nome, materialeProduzione, clasificazionePerEta, prezzo, dimensioni, elettrico);
						
					break;
				}
	}
	
	public static void visualizzaNegozio(Negozio negozio){
        if (negozio != null) {
            System.out.println(negozio.toString());
        } else {
            System.out.println("Nessun negozio presente!");
        }
    }
	
	private static void cercaGiocattolo(Negozio negozio) {
        Scanner scanner = new Scanner(System.in);
		Println("Cosa vuoi cercare? 1 per le costruzioni e 2 per un trenino");
		
		int s3 = scanner.nextInt();
		
			switch(s3){
				case 1:
					
					if (negozio != null) {
						System.out.print("Inserisci il nome del trenino da cercare: ");
						String nome = scanner.next();
						Giocattolo trovato = negozio.ricercaCostruzioni(nome);
						if (trovato != null) {
							System.out.println("Costruzioni trovate: " + trovato.toString());
						} else {
							System.out.println("Costruzioni non trovate o non esistenti nel negozio.");
						}
					} else {
						System.out.println("Non è stato creato alcun negozio.");
					}
					
				break;
				
				case 2:
				
					if (negozio != null) {
						System.out.print("Inserisci il nome del trenino da cercare: ");
						String nome = scanner.next();
						Giocattolo trovato1 = negozio.ricercaTrenino(nome);
						if (trovato1 != null) {
							System.out.println("Trenino trovato: " + trovato1.toString());
						} else {
							System.out.println("Trenino non trovato o non esistente nel negozio.");
						}
					} else {
						System.out.println("Non è stato creato alcun negozio.");
					}
					
				break;
				
				default: 
					System.out.println("Scelta E  R  R  A  T  A  !  ");
				break;
			}
    }
	
	
	
}
