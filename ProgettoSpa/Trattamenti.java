public class Trattamenti {
	
	//attributi privati
	
	private float costo;
	private String nome;
	private String descrizione;
	
	//costruttore vuoto
	
	public Trattamenti(){}
	
	//costruttore con parametri
	
	public void Trattamenti(float costo, String nome, String descrizione){
		
		this.costo = costo;
		this.nome = nome;
		this.descrizione = descrizione;
		
	}
	
	//Set e get
	
	public void setCosto(float costo){

		this.costo = costo;

	}
	
	public float getCosto(){
		
		return this.costo;
		
	}
	
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
	
	//toString
	
	public String toString(){
		
		return "Nome: "+this.nome +"\nCosto: "+this.costo +"\nDescrizione: " +this.descrizione;
		
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	