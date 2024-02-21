package progettoUfficio;


public class Impiegato extends Dipendente {

	private String incarico;	
	private String giorniLavoroSettimanali;
	private int numOre;
	
	public Impiegato(String nome, String cognome, String incarico, String giorniLavoroSettimanali, int numOre){
		
		super(nome, cognome);
		this.incarico = incarico;
		this.giorniLavoroSettimanali = giorniLavoroSettimanali;
		this.numOre = numOre;
			
	}

        public String getIncarico() {
            return incarico;
        }

        public void setIncarico(String incarico) {
            this.incarico = incarico;
        }

        public String getGiorniLavoroSettimanali() {
            return giorniLavoroSettimanali;
        }

        public void setGiorniLavoroSettimanali(String giorniLavoroSettimanali) {
            this.giorniLavoroSettimanali = giorniLavoroSettimanali;
        }

        public int getNumOre() {
            return numOre;
        }

        public void setNumOre(int numOre) {
            this.numOre = numOre;
        }

        @Override
        public String toString() {
            return "Incarico: " + incarico + "Giorni di lavoro settimanali: " + giorniLavoroSettimanali + "Ore di lavoro settimanali: " + numOre;
        }
		
		
		
		
		
		
}
