//Email.java

class Email{

	//attributi privati
	
		private String destinatario;
		private String mittente;
		private String oggetto;
		private String testo;
		
		
	//metodi costruttori
	
		public Email(){}
		
		public Email(String destinatario, String mittente, String oggetto, String testo){
			this.destinatario = destinatario;
			this.mittente = mittente;
			this.oggetto = oggetto;
			this.testo = testo;
			
		}
		
	//Metodi set (inizializzare) e get (Stampare) per l'attributo destinatario
	//con la parola chiave this facciamo riferimento all'attributo
	
		public void setDestinatario(String destinatario){
			this.destinatario = destinatario;
		}
	
		public String getDestinatario(){
			return this.destinatario = destinatario;
		}
		
	//Metodi per l'attributo mittente
	
		public void setMittente(String mittente){
			this.mittente = mittente;
		}

		public String getMittente(){
			return this.mittente = mittente;
		}

	//Metodi per l'attributo oggetto
		
		public void setOggetto(String oggetto){
			this.oggetto = oggetto;
		}

		public String getOggetto(){
			return this.oggetto = oggetto;
		}

	//Metodi per l'attributo testo

		public void setTesto(String testo){
			this.testo = testo;
		}

		public String getOggetto(){
			return this.testo = testo;
		}

	