class Giocatori{

//attributi privati

	private String nome;
	private String cognome;
	private String dataNascita;
	private String ruolo;
	
//Costruttore vuoto

	public Giocatori (){}
	
//Costruttore con parametri

	public Giocatori(String nome, String cognome, String dataNascita, String ruolo){
	
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.ruolo = ruolo;
		
	}
	
//metodi set e get per ogni attributo

	public void setNome(String nome){
	
		this.nome = nome;
		
	}
	
	public String getNome(){
	
		return this.nome;
		
	}
	
	public void setCognome(String cognome){
	
		this.cognome = cognome;
		
	}
	
	public String getCognome(){
	
		return this.cognome;
		
	}
	
	public void setNascita(String dataNascita){
	
		this.dataNascita = dataNascita;
		
	}
	
	public String getNascita(){
	
		return this.dataNascita;
		
	}
	
	public void setRuolo(String ruolo){
	
		this.ruolo = ruolo;
		
	}
	
	public String getRuolo(){
	
		return this.ruolo;
		
	}
	
//Metodo toString
	
	public String toString(){
	
		return nome + cognome + dataNascita + ruolo;
		
	}
	
}

