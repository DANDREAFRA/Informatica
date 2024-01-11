public class Trattamenti {
	
	//attributi privati
	
	private float costo;
	private String nome;
	private String descrizione;
	private int durata;
	
	//costruttore vuoto
	
	public Trattamenti(){}
	
	//costruttore con parametri
	
	public void Trattamenti(float costo, String nome, String descrizione, int durata){
		
		this.costo = costo;
		this.nome = nome;
		this.descrizione = descrizione;
		this.durata = durata;
		
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
	
	public void setDurata(int durata){
		
		this.durata = durata;
		
	}
	
	public int getDurata(){
		
		return this.durata;
		
	}
	
	//toString
	
	public String toString(){
		
		return "Nome: "+this.nome +"\nCosto: "+this.costo +"$\nDescrizione: " +this.descrizione+ "\nDurata: " +this.durata+ "min\n";
		
	}
	
	//metodo per chiedere in input i dati
	
	public static void setALL(){
		
		System.out.print("Inserisci il nome del trattamento: "\n);
		
		try{
			this.nome = tastiera.readLine();
		} catch(IOException e){}
				
		System.out.print("Inserisci il costo del trattamento: "\n);
		
		try{	
			String n = tastiera.readLine();
			this.costo = Float.valueOf(n).floatValue();
		}catch (IOException a){
			
			System.out.println("costo del trattamento non valido.");
			
		}
		
		System.out.print("Descrivi un po il trattamento: ");
		
		try{
			this.descrizione = tastiera.readLine();
		} catch(IOException e){}
		
		System.out.println("Durata del trattamento: ");
		
		try{
			String b = tastiera.readLine();
			this.durata = Integer.valueOf(b).intValue();
		} catch (IOException a){
			
			System.out.println("Valore inserito non valido.");
			
		}
		
	}	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	