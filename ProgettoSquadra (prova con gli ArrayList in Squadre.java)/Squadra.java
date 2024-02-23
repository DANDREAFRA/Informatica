package progettasquadra;

public class Squadra {

	private ArrayList<Giocatore> lista;
    private String nome;
    private String citta;
    private int annoFondazione;
    private String campionato;
    private Allenatore primoAllenatore;
    private Allenatore viceAllenatore;
    private int numGiocatori = 0; //Dimensione effettiva dell'array
	
	giocatori = new ArrayList(20);

	public Squadra(){
		
		 this.lista = new ArrayList<>();

	}




    public Squadra(String nome, String citta, int annoFondazione, String campionato, Allenatore primoAllenatore, Allenatore viceAllenatore) {
        
		this();							
		
		this.nome = nome;
        this.citta = citta;
        this.annoFondazione = annoFondazione;
        this.campionato = campionato;
        this.primoAllenatore = primoAllenatore;
        this.viceAllenatore = viceAllenatore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getAnnoFondazione() {
        return annoFondazione;
    }

    public void setAnnoFondazione(int annoFondazione) {
        this.annoFondazione = annoFondazione;
    }

    public String getCampionato() {
        return campionato;
    }

    public void setCampionato(String campionato) {
        this.campionato = campionato;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(Giocatore[] giocatori) {
        this.giocatori = giocatori;
    }

    public Allenatore getPrimoAllenatore() {
        return primoAllenatore;
    }

    public void setPrimoAllenatore(Allenatore primoAllenatore) {
        this.primoAllenatore = primoAllenatore;
    }

    public Allenatore getViceAllenatore() {
        return viceAllenatore;
    }

    public void setViceAllenatore(Allenatore viceAllenatore) {
        this.viceAllenatore = viceAllenatore;
    }

    public int getNumGiocatori() {
        return numGiocatori;
    }

    public void setNumGiocatori(int numGiocatori) {
        this.numGiocatori = numGiocatori;
    }
    
    public void aggiungiGiocatore(Giocatore giocatore) {
		
		try{
			this.lista.add(giocatore);
		} catch (IOException a){
			System.out.println("INPUT_ERROR_");
		}
		
	}
		
	
		
		
       

    public Giocatore ricercaGiocatore(String cognome, String nome) {
		
		for(int x=0; x<lista.size(); z++){
			
			if(lista.get(x).getNome() == nome && lista.get(x).getCognome == cognome){
				return lista.get(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        for(int i=0; i<giocatori.length;i++) {
            if (giocatori[i] != null && giocatori[i].getCognome().equalsIgnoreCase(cognome) && giocatori[i].getNome().equalsIgnoreCase(nome)) {
                return giocatori[i];
            }
        }
        return null;
    }

    //Metodo di ricerca che restituisce la posizione
    public int ricercaGiocatorePosizione(String cognome, String nome) {
        for(int i=0; i<giocatori.length;i++) {
            if (giocatori[i] != null && giocatori[i].getCognome().equalsIgnoreCase(cognome) && giocatori[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    
    public void cancellaGiocatore(String cognome, String nome) {
    int posizione = ricercaGiocatorePosizione(cognome, nome);
    if (posizione != -1) {
        System.out.println("Giocatore rimosso dalla squadra");
        for(int i=posizione;i<this.numGiocatori-1; i++){
            giocatori[i]=giocatori[i+1];
        }
        this.numGiocatori--;
    } else {
        System.out.println("Giocatore non trovato.");
    }
}
public void visualizzaGiocatori() {
    System.out.println("Giocatori nella squadra " + this.nome + ":");
    for (int i = 0; i < numGiocatori; i++) {
        System.out.println(this.giocatori[i].toString());
    }
}
    
@Override
public String toString(){
    String squadraGiocatori;
    squadraGiocatori = "Dati squadra:\n" + "Nome: "+ this.nome + "\nCittà: " + this.citta + "\nAnno di fondazione: " + this.annoFondazione + "\nCampionato: " + this.campionato + "\nAllenatori:\n";
    squadraGiocatori += "Primo allenatore: " + this.primoAllenatore.toString() + "\nVice allenatore: "+ this.viceAllenatore.toString() + "\nLista giocatori:\n";
    for (int i = 0; i < numGiocatori; i++) {
        squadraGiocatori+= this.giocatori[i].toString();
    }
    return squadraGiocatori;
}
/*public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Squadra: ").append(nome).append("\n");
    sb.append("Città: ").append(citta).append("\n");
    sb.append("Anno di fondazione: ").append(annoFondazione).append("\n");
    sb.append("Campionato: ").append(campionato).append("\n");
    sb.append("Primo Allenatore ").append(primoAllenatore).append("\n");
    sb.append("Vice Allenatore ").append(viceAllenatore).append("\n");
    sb.append("Giocatori:\n");
    for (int i=0;i<this.numGiocatori;i++) {
        if (giocatori[i] != null) {
            sb.append(giocatori[i]).append("\n");
        }
    }
    return sb.toString();
}
}
*/
}

    

