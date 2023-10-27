//Rinominare il file "Studente.java"

class Studente {
	
//Attributi privati

	private String cognome;
	private String nome;
	private Date natoil;
	private String telefono;
	private String mail;
	
//Costruttore vuoto

	public Studente (){}
	
//Costruttore con parametri

	public Studente (String cognome, String nome, Date natoil; String telefono; String mail){
		
//Metodi set e get per ogni attributo

	public setCognome(String cognome){
		
		this.cognome = cognome;
		
	}
	
	public String getCognome(){
		
		return this.cognome;
		
	}
	
	public setNome(String nome){
		
		this.nome = nome;
		
	}
	
	public String getNome(){
		
		return this.nome;
		
	}
	
	public setNascita(Date natoil){
		
		this.natoil = natoil;
		
	}
	
	public Date getNascita(){
		
		return this.natoil;
		
	}
	
	public setTelefono(String telefono){
		
		this.telefono = telefono;
		
	}
	
	public String getTelefono(){
		
		return this.telefono;
		
	}
	
	public setMail(String mail){
		
		this.mail = mail;
		
	}
	
	public String getMail(){
		
		return this.mail;
		
	}
	
	public String toString(){
		
		return "Cognome: " this.cognome + "\nNome: " + this.nome + "\nNato il: " + this.natoil + "\nNumero di telefono: " + this.telefono + "\nIndirizzo email: " + this.mail;	
	
	}
	
}
	
	
	
	
	