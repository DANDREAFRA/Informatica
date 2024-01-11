import java.io.*;

class ProgettoSpa {
	
	//numero massimo di trattamenti nella Spa (costante)
	static final int DIM = 5;
	static int contatoreTrattamenti;
	
	
	public ProgettoSpa(){
		trattamenti = new Trattamenti[DIM];
		contatoreTrattamenti = 0;
		
		trattamenti[conatoreTRattamenti++] = new Trattamento
		
		if(numeroTrattamenti = 0){
			System.out.println("Trattamenti non esistenti o al momento non disponibili. Riprovare tra 10 minuti. Grazie");
			break;
		}
		System.out.println("Trattamenti disponibili: ");
		public void visualizzaTrattamenti(){
			for (int i=0; i<contatoreTrattamenti; i++){
				System.out.println(trattamenti[i].toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static void main(String []args){
	
		//creazione di un array di oggetti di tipo "Trattamenti"
		Trattamenti []trattamenti = new Trattamenti[DIM];	
		int scelta;
		
		
		do{
			scelta = mainMenu();
			switch(scelta){
				case 1:
					aggiungiTrattamento();
				break;	
					
				case 2:
					visualizzaTrattamenti();
				break;
				
				default:
					System.out.println("Opzione non esistente o non disponibile al momento!");
				break;
		} while(scelta!=0)
			
			System.out.println("PROGRAM:SHUTDOWN_");
		
	}
		
		
	//metodo per l'aggiunta di trattamenti
	public static void aggiungiTrattamento(){
		if(contatoreTrattamenti<DIM){
			try{
				BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("Inserisci il nome del nuovo trattamento: ");
				String nome = tastiera.readLine();
				
				System.out.print("Inserisci la descrizione del nuovo trattamento: ");
				String descrizione = tastiera.readLine();
				
				System.out.print("Inserisci il costo del nuovo trattamento: ");
				String a = tastiera.readLine();
				double costo = Double.valueOf(a).doubleValue();
				
				System.out.print("Inserisci la durata del trattamento: ");
				int durata = Integer.parseInt(tastiera.readLine());
				
				trattamenti[contatoreTrattamenti] = new Trattamenti(nome, costo, descrizione, durata);
				contatoreTrattamenti++;
				
				System.out.println("Il trattamento è stato aggiunto con successo!");
	
			} catch (IOException | NumberFormatException e){
				System.out.println("Inserimento non valido.");
			}
		} else {
			System.out.println("LIMITE MASSIMO RAGGIUNTO!");
		}
		
	}
		
		
	public void scontoEta(){
		
		
		
		
		
		
		//visualizza gli sconti disponibili
		//Visualizza i trattamenti
		//Scegliere il trattamento
		//inserire l'età
		//Visualizzare il costo scontato
		
	//cercatrattamentoperprezzo
	
	//chiedere di inserire valore minimo e valore massimo
	//inserire  valore massimo//cercare tramite ciclo for nell'array i trattamenti che rientrano in quel range.
	//aggiungere nella classe trattamenti l'attributo durata
	
	
	
	
	public void cercaTrattamentoPerPrezzo (){
		
		int valmin valMAX;
		
		System.out.println("Inserisci un valore minimo di prezzo");
		
		try{
		String f = tastiera.readLine();
		valmin = Integer.valueOf(f).intValue();
		} catch (NumberFormatException){
			System.out.println("Valore inserito in modo errato. Si prega di scrivere a caratteri numerici (Es. 4,5,6,1)");
		}
		
		System.out.println("Inserisci un valore massimo di prezzo");
		
		try{
		String l = tastiera.readLine();
		valMAX = Integer.valueOf(l).intValue();
		} catch (NumberFormatException){
			System.out.println("Valore inserito in modo errato. Si prega di scrivere a caratteri numerici (Es. 4,5,6,1)");
		}
		
		if((valmin < valMAX) && (valmin != valMAX)){
			
			for(int d3=0; d3<DIM; d3++){
				System.out.println(trattamenti[d3].toString());
			}
			//????
		
		
		
		
		} else {
			
			System.out.println("Il valore minimo non può essere più alto del valore massimo!   ||   Il valore minimo non può essere uguale al valore massimo!");
		}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
	public static void scontoEta(){
		
		int eta, prezzoScontato;
		System.out.println("Inserisci la tua eta'. In base all'eta' avrai uno sconto su tutti i trattamenti");
		
			try{
				
				String eta1 = tastiera.readLine();
				eta = Integer.valueOf(eta1).intValue();
				
			} catch(IOException a){
				
				System.out.println("Eta' inserita non valida.");
				
			}
			
			if(eta>=0 && eta<18){
				System.out.println("Hai diritto ad uno sconto del 10% su tutti i trattamenti! Buono no?");
				
				
		
	
		
		//Menu principale (Mostra le opzioni e permette la scelta tra 4 opzioni (0,1,2,3))
		static public int mainMenu(){
			
			BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
			
			int scelta;
			
			System.out.println("-------Scegli una tra queste opzioni-------");
			System.out.println("");
			System.out.println("--------1. Aggiungi un trattamento---------");
			System.out.println("--2. Visualizza i trattamenti disponibili--");
			System.out.println("-----3. Applica sconto in base all'eta'----");
			System.out.println("----Premi '0' per uscire dal programma.----");
			System.out.println("");
			
			try{
				String a = tastiera.readLine();
				scelta = Integer.valueOf(a).intValue();
			} catch(IOException a){
				System.out.println("Scelta non valida.");
			}
		
			return scelta;
			
		}
		
		
		
		
		//metodo per chiedere in input i dati del trattamento
	
	public static void set_ALL(){
		
		
		float costo = 0;
		String nome = null, descrizione = null;
		
		System.out.println("Inserisci il nome del trattamento: ");
		
		try{
			this.nome = tastiera.readLine();
		} catch(IOException e){}
				
		System.out.println"Inserisci il costo del trattamento: ");
		
		try{	
			String n = tastiera.readLine();
			this.costo = Float.valueOf(n).floatValue();
		}catch (IOException a){
			
			System.out.println("costo del trattamento non valido.");
			
		}
		
		System.out.println("Descrivi un po il trattamento: ");
		
		try{
			this.descrizione = tastiera.readLine();
		} catch(IOException e){}
		
	}	
		
		
	public static void visualizzaTrattamenti(Trattamenti []trattamenti){
		
			System.out.println("Ecco i trattamenti al momento disponibili: ");
			for(int f=0; f<DIM; f++){
				if(trattamenti[f].isEmpty()){
					System.out.println("Spazio vuoto! Se vuoi puoi aggiungere un nuovo trattamento.");
				} else {
					System.out.println(trattamenti[f].toString());
			}
	}
	
				
		
		
}




//metodi per l'I/O
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in)
		
		//Variabile per ogni attributo
		
		float costo = 0;
		String descrizione = null, nome = null;