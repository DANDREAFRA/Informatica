package progettostrumentimusicali;

public class ProgettoStrumentiMusicali {

    import java.io.*;
    import java.util.*;
	import java.time.*;
	
    public static void main(String[] args) {
        Negozio newNegozio = null;
		Strumento newStrumento = null;
        int slt = 0;
		String id = "";
		Scanner r = new Scanner(System.in);
		System.out.println("Inserisci l'ID di uno strumento");
		id = r.nextLine();
		
		
            do{
                slt = mn();
                switch(slt){
                    case 1:
                        creaNegozio();
                    break;
                    case 2:
                        visualizzaNegozio();
                    break;
                    case 3:
                        aggiungiStrumento(Negozio newNegozio);
                    break;
                    case 4:
                        cercaStrumento(id);
                    break;
                    case 5:
                        rimuoviStrumento();
                    break;
                    case 0: 
                        System.out.println("SHUTTING_DOWN_");
                    break;
                    default:
                        System.out.println("Il valore della scelta può essere solo tra 0 e 5");
                    break;
                }
            } while(slt!=0);
    }
	
	//menu
    
	public int mn(){
		
		Scanner scanacs = new Scanner(System.in);
		
			System.out.println("Fai una tra le seguenti scelte");
			System.out.println("1. Crea un negozio");
			System.out.println("2. Visualizza il negozio (e i vari articoli)");
			System.out.println("4. Cerca uno strumento per id ");
			System.out.println("5. Rimuovi strumento dal catalogo");
			System.out.println("...e premi 0 per uscire");
	
		try{
		int slt = scanacs.nextInt();
		}catch(NumberFormatException a){
			System.out.println("La scelta può essere scritta solo in formato numerico");
			return null;
		}
		return slt;
	}
		
	
	
    public Negozio creanegozio(){
        
		String nome, indirizzo, telefono, mail, pIva;

		
		
            Scanner rennacs = new Scanner(System.in);
			System.out.println("Inserire i dati del negozio");
			
		do{
			try{ 
				System.out.println("Nome: ");
				nome = rennacs.nextLine();
				System.out.println("Indirizzo/via: ");
				indirizzo = rennacs.nextLine();
				System.out.println("Numero di telefono: ");
				telefono = rennacs.nextLine();
				System.out.println("Indirizzo mail: ");
				mail = rennacs.nextLine();
				System.out.println("Partiva iva: ");
				pIva = rennacs.nextLine();
			}catch(Exception a){}
		} while(nome.isEmpty() || indirizzo.isEmpty() || telefono.isEmpty() || mail.isEmpty() || pIva.isEmpty()); 
		
		return new Negozio(nome, indirizzo, telefono, mail, pIva);
		
    }
    
	public Strumento aggiungiStrumento(){
		
		String id, nome, tipo, marca, modello;
		double prezzo;
		
		String archetto;
		int annoCostruzione, numCorde;
		
		String tonalita;
		int numBassi;
		
		
		Scanner _null_ = new Scanner(System.in);
		System.out.println("Inserisci i dati dello strumento");
		
		int s2;
		
		System.out.println("Premi 1 per aggiungere un violino, 2 per aggiungere una fisarmonica e 3 per aggiungere un altro strumento");
		s2 = _null_.nextLine();
		
		switch(s2){
				
		
			case 1: 
		
				do{
					System.out.println("ID: ");
					id = _null_.nextLine();
					System.out.println("Nome: ");
					nome = _null_.nextLine();
					System.out.println("Tipo: ");
					tipo = _null_.nextLine();
					System.out.println("Marca: ");
					marca = _null_.nextLine();
					System.out.println("numero modello: ");
					modello = _null_.nextLine();
					try{
						System.out.println("Prezzo: ");
						prezzo = _null_.nextLine();	
					}catch(IOException && NumberFormatException a){
						System.out.println("Il prezzo può avere solo valore numerico");
						return null;
					}
				}while(id.isEmpty() || nome.isEmpty() || tipo.isEmpty() || marca.isEmpty() || modello.isEmpty() || prezzo == 0.0);

				return new Strumento(id, nome, tipo, marca, modello, prezzo);
			
			break;
			
			case 2:
			
				do{
					System.out.println("ID: ");
					id = _null_.nextLine();
					System.out.println("Nome: ");
					nome = _null_.nextLine();
					System.out.println("Tipo: Fisarmonica");
					System.out.println("Marca: ");
					marca = _null_.nextLine();
					System.out.println("numero modello: ");
					modello = _null_.nextLine();
					System.out.println("Tonalita': ");
					tonalita = _null_.nextLine();
					try{
						System.out.println("Numero di bassi: ");
						numBassi = _null_.nextLine();
						System.out.println("Prezzo: ");
						prezzo = _null_.nextLine();	
					}catch(IOException && NumberFormatException a){
						System.out.println("Il prezzo e il numero di bassi possono avere solo valori numerici");
						return null;
					}
				}while(id.isEmpty() || nome.isEmpty() || tipo.isEmpty() || marca.isEmpty() || modello.isEmpty() || prezzo == 0.0 || tonalita.isEmpty() || numBassi == 0);
		
				return new Fisarmonica(int numBassi, String tonalita, String nome, String tipo, String marca, String modello, double prezzo, String id);
			
			break;
			
			case 3:
			
				do{
					System.out.println("ID: ");
					id = _null_.nextLine();
					System.out.println("Nome: ");
					nome = _null_.nextLine();
					System.out.println("Tipo: Fisarmonica");
					System.out.println("Marca: ");
					marca = _null_.nextLine();
					System.out.println("numero modello: ");
					modello = _null_.nextLine();
					System.out.println("Archetto: ");
					archetto = _null_.nextLine();
					try{
						System.out.println("Numero di corde: ");
						numCorde = _null_.nextLine();
						System.out.println("Anno di costruzione: ");
						annoCostruzione = _null_.nextLine();
						System.out.println("Prezzo: ");
						prezzo = _null_.nextLine();	
					}catch(IOException && NumberFormatException a){
						System.out.println("Il prezzo e il numero di bassi possono avere solo valori numerici");
						return null;
					}
				}while(id.isEmpty() || nome.isEmpty() || tipo.isEmpty() || marca.isEmpty() || modello.isEmpty() || prezzo == 0.0 || archetto.isEmpty() || annoCostruzione == 0 || numCorde == 0);
			
				return new Violino(int numCorde, int annoCostruzione, String archetto, String nome, String tipo, String marca, String modello, double prezzo, String id)
			
			break;
			
			default: 
			
				System.out.println("Le scelte, come descritto, possono avere un valore da 1 a 3");
		
			break;
			
		}
			
	}
	
	
	
	
	
}
