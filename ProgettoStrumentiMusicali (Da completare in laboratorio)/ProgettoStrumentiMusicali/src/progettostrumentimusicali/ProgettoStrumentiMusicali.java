package progettostrumentimusicali;

public class ProgettoStrumentiMusicali {

    import java.io.*;
    import java.util.*;
	
    public static void main(String[] args) {
        Negozio n = null;
        int slt = 0;
        
            do{
                slt = mn();
                switch(s){
                    case 1:
                        n = creaNegozio();
                    break;
                    case 2:
                        visualizzaNegozio(n);
                    break;
                    case 3:
                        aggiungiStrumento(n);
                    break;
                    case 4:
                        cercaStrumento(n);
                    break;
                    case 5:
                        rimuoviStrumento(n);
                    break;
                    case 0: 
                        System.out.println("SHUTTING_DOWN_");
                    break;
                    default:
                        System.out.println("Il valore della scelta può essere solo tra 0 e 5");
                    break;
                }
            } while(s!=0);
    }
	
	//menu
    
	public int mn(){
		
		Scanner scanacs = new Scanner(System.in);
		
			System.out.println("Fai una tra le seguenti scelte");
			System.out.println("1. Crea un negozio");
			System.out.println("2. Visualizza il negozio (e i vari articoli)");
			System.out.println("3. Aggiungi uno strumento");
			System.out.println("4. Cerca uno strumento per nome (Anche gli strumenti hanno dei nomi! Esempio: il violino piu' costoso al mondo si chiama 'Viexutemps' e risale al 1741. Nel 2012 fu venduto per 16 milioni di dollari)");
			System.out.println("5. Rimuovi strumento dal catalogo");
			System.out.println("...e premi 0 per uscire");
	
		try{
		int s = scanacs.nextInt();
		}catch(NumberFormatException a){
			System.out.println("La scelta può essere scritta solo in formato numerico");
			return null;
		}
		return s;
	}
		
	
	
    public Negozio creanegozio(){
            Negozio z;
        
            Scanner rennacS = new Scanner(System.in);
        
        do{
        
            System.out.println("Inserire la partita iva: ");
            String nome, indirizzo, telefono, pIva = rennacS.nextLine();
        }while(pIva.length() != 11);
        
        z = new Negozio(nome, indirizzo, telefono, pIva);
		
		return
		
    }
    
	public void aggiungiStrumento(){
		
		//?????????
		
		
}
