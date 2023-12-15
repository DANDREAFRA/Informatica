class Videogioco {
	
	private String titolo = null;
	private String lancio = null;
	private String genere = null;
	private float prezzo = null;
	private String piattaforme = null;
	
	//costruttore vuoto
	
	public void Videogioco (){}
	
	//costruttore con parametri
	
	public void Videogioco (String titolo, String lancio, String genere, float prezzo, String piattaforme){
		
		this.titolo = titolo;
		this.lancio = lancio;
		this.genere = genere;
		this.prezzo = prezzo;
		this.piattaforme = piattaforme;
		
	}
	
	//Set e get x ogni attributo
	
	public void setTitolo(String titolo){
		
		this.titolo = titolo;
		
	}
	
	public String getTitolo(){
		
		return this.titolo;
		
	}
	
	public void setLancio(String lancio){

			this.lancio = lancio;
			
	}
	
	public String getLancio(){
		
		return this.lancio;
		
	}
	
	public void setGenere(String genere){

			this.genere = genere;
			
	}
	
	public String getGenere(){
		
		return this.genere;
		
	}
	
	public void setPrezzo(float prezzo){

			this.prezzo = prezzo;
			
	}
	
	public float getPrezzo(){
		
		return this.prezzo;
		
	}
	
	public void setPiattaforme(String piattaforme){
		
		this.piattaforme = piattaforme;
		
	}
	
	public void setALL(){
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.println("Inserire nome del gioco:");
		
		titolo = tastiera.readLine();
		
		System.out.println("Inserire data di lancio (speriamo che non si rompa):");
		
		lancio = tastiera.readLine();
		
		System.out.println("Inserire il genere di gioco:");
		
		genere = tastiera.readLine();
		
		System.out.println("Inserire il prezzo di lancio (Che si abbasserà col passare del tempo):");
		
		try{
			
			String a = tastiera.readLine();
			prezzo = Float.valueOf(a).floatValue;
			
		} catch (IOException a){

			System.out.println("Il prezzo non è stato inserito in modo corretto");

		}
		
		System.out.println("Inserire le piattaforme sulle quali il gioco potrà essere disponibile");
		
		piattaforme = tastiera.readLine();
			
	}
	
	public String toString(){
		
			return "Titolo: " + this.titolo + "Data di lancio: " + this.lancio + "Genere: " + this.genere + "Prezzo attuale: " + this.prezzo + "Piattaforme: " + this.piattaforme;
			
			