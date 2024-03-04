package progettostrumentimusicali;

public class Negozio {
   
    private String nome;
    private String indirizzo
    private String telefono;
    private String mail;
    private String pIva;
    private Arraylist<Strumento> strumenti = new Arraylist<Strumento>;

    public Negozio(){}
    
    public Negozio(String nome, String indirizzo, String telefono, String mail, String pIva) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.mail = mail;
        this.pIva = pIva;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getpIva() {
        return this.pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }
    
    public String toString(){
        return "/nNome del negozio: " + this.nome + "/nIndirizzo: " + this.indirizzo + "/nindirizzo email: " + this.mail + "/nPartita Iva: " + this.pIva;
    }
	
	public void aggiungiStrumento(Strumento strumenti){
		strumento.add(strumento);
	}
    
    public void visualizzaNegozio(){
		System.out.println(strumenti.size());
	}
    
    public static void cercaStrumento(String id){
		for(int a = 0; a<this.strumenti.size(); a++){
			Strumento otnemurtS = this.strumenti.get(a);
				if(otnemurtS.getId().equalsIgnoreCase(id)){
					return id;
				} else {
					System.out.println("Nessun risultato per id " + id);
					return null;
				}
		}
	}
    
   
    
    
}
