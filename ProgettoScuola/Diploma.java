//Diploma.java

class Diploma {
	
//Attributo

	private String tipo;
	private int anno;
	private float voto;
	
	
//Metodi (Sottoprogrammi)

	public Diploma(){}
	
//this serve ad accedere ad attributi e metodi della stessa classe e li distingue dai parametri
	public void Diploma(String tipo, int anno, float voto){
		
		this.tipo = tipo;
		this.anno = anno;
		this.voto = voto;
	
	}
	
//Metodi set e get

	public void setTipo(String tipo){
		
		this.tipo = tipo;
		
	}
	
	public String getTipo(){
		
		return this.tipo;
		
	}
	
	public void setAnno(int anno){
		
		this.anno = anno;
		
	}
	
	public int getAnno(){
		
		return this.anno;
		
	}
	
	public void setVoto(float voto){
		
		this.voto = voto;
		
	}
	
	public float getVoto(){
		
		return this.voto;
		
	}
	
	public String toString(){
		
		return "Tipo: " this.tipo + "\nAnno: " + this.anno + "\nVoto: " + this.voto;
	
	}
	
}
	
	
