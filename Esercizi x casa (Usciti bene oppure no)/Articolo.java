class Articolo {
	
	
	//Attributi privati della classe
	private String nome;
	private String descrizione;
	private float prezzo;
	
	//Costruttore
	public Articolo () {}
	
	public Articolo(String nome, String descrizione, float prezzo){
		
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		
	}
	
	//metodi (Sottoprogrammi all'interno della classe)
	
	public void setNome(String nome){
		
		this.nome = nome;
		
	}
	
	public String getNome(){
		
		return this.nome;
		
	}
	
	public void setDescrizione(String descrizione){
		
		this.descrizione = descrizione;
	
	}
	
	public String getDescrizione(){
		
		return this.descrizione;
		
	}
	
	public void setPrezzo(float prezzo){
		
		this.prezzo = prezzo;
		
	}
	
	public float getPrezzo(){
		
		return this.prezzo;
		
	}
	
	public String toString(){
		
		return "Nome articolo = " +nome+ "\nDescrizione dell'articolo = " +descrizione;
	
	}
	
	public float toFloat(){
		
		return "Prezzo articolo = " +prezzo;
		
	}
	
}