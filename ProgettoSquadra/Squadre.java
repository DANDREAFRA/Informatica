class Squadre{

//attributi privati

	private String nomeSquadra;
	private int numGiocatori;
	private int vinte;
	private int perse;
	
//Costruttore vuoto

	public Squadre (){}
	
//Costruttore con parametri

	public Squadre(String nomeSquadra, int numGiocatori, int vinte, int perse){
	
		this.nomeSquadra = nomeSquadra;
		this.numGiocatori = numGiocatori;
		this.vinte = vinte;
		this.perse = perse;
		
	}
	
//metodi set e get per ogni attributo

	public void setNomeSquadra(String nomeSquadra){
	
		this.nomeSquadra = nomeSquadra;
		
	}
	
	public String getNomeSquadra(){
	
		return this.nomeSquadra;
		
	}
	
	public void setGiocatori(int numGiocatori){
	
		this.numGiocatori = numGiocatori;
		
	}
	
	public int getGiocatori(){
	
		return this.numGiocatori;
		
	}
	
	public void setPartiteVinte(int vinte){
	
		this.vinte = vinte;
		
	}
	
	public int getPartiteVinte(){
	
		return this.vinte;
		
	}
	
	public void setPartitePerse(int perse){
	
		this.perse = perse;
		
	}
	
	public int getPartitePerse(){
	
		return this.perse;
		
	}
	
//Metodo toString
	
	public String toString(){
	
		return nomeSquadra + numGiocatori + vinte + perse;
		
	}
	
}