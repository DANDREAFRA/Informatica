import java.io.*;

class Paziente {
	private String nome = null;
	private int eta = 0;
	private String codfisc = null;
	private boolean ricoverato = false;
	private int pressione = 0;

		public void Ospedale(){}
			
		public void Ospedale(String nome, String codfisc, int eta, int pressione, boolean ricoverato){
			
			this.nome = nome;
			this.codfisc = codfisc;
			this.eta = eta;
			this.pressione = pressione;
			this.ricoverato = ricoverato;
			
		}
		
	//Set e get
	
	public void setNome(String nome){
		
		this.nome = nome;
		
	}
	
	public String getNome(){
		
		return this.nome;
		
	}
	
	public void setCodfisc(String codfisc){
		
		this.codfisc = codfisc;
		
	}
	
	public String getCodfisc(){
		
		return this.codfisc;
		
	}
	
	public void setEta(int eta){
		
		this.eta = eta;
		
	}
	
	public int getEta(){
		
		return this.eta;
		
	}
	
	public void setPressione(int pressione){
		
		this.pressione = pressione;
		
	}
	
	public int getPressione(){
		
		return this.pressione;
		
	}
	
	public void setRicoverato(boolean ricoverato){
		
		this.ricoverato = ricoverato;
		
	}
	
	public boolean getRicoverato(){
		
		return this.ricoverato;
		
	}
	
	public void setALL(String nome, String codfisc, int eta, int pressione, boolean ricoverato){
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.println("Inserire nome del paziente");
			this.nome = tastiera.readLine();
			
		System.out.println("Inserire il codice fiscale");
			this.codfisc = tastiera.readLine();
			
		System.out.println("Inserire l'eta' del paziente");
		try{
			String a = tastiera.readLine();
			this.eta = Integer.valueOF(a).intValue();
		} catch (IOException a){		
			System.out.println("Eta' non inserita correttamente. Riprova");
		}
		
		System.out.println("Inserire la pressione sanguigna");
		try{
			String example = tastiera.readLine();
			this.pressione = Integer.valueOF(example).intValue();
		} catch (IOException a){
			System.out.println("Pressione sanguigna non inserita correttamente. Riprova");
		}
		
		System.out.println("Il paziente e' ricoverato?");
			String boole = tastiera.readLine();
				if(boole=="Si" || boole=="si"){
					this.ricoverato = true;
				} else {
					this.ricoverato = false;
				}
				
	}
					
	
	public void condizioni(boolean ricoverato, int pressione){
		
		if((this.pressione<=140 || this.pressione>=60) && (this.ricoverato==false)){
			
			System.out.println("Il paziente e' in buone condizioni di salute");
			
		} else {
			
			if((this.pressione<=140 || this.pressione>=60) && (this.ricoverato==true)){
				
				System.out.println("Il paziente e' al momento stabile");
				
			} else {
				
				if((this.pressione>140 || this.pressione<60) && (this.ricoverato==false)){
					
					System.out.println("Il paziente va ricoverato");
					
				} else {
					
					if((this.pressione>140 || this.pressione<60) && (this.ricoverato==true)){
						
						System.out.println("il paziente non si sente bene");
						
					}
				}
			}
		}
		
	}
	
	public String toString(){
		
		return "Nome del paziente: " + this.nome + "Codice fiscale: " + this.codfisc + "Eta' del paziente: " + this.eta + "Pressione sanguigna del paziente: " + this.pressione + "Attualmente ricoverato: " + this.ricoverato;

	}
}	
				