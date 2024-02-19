import java.io.*;
	class GestioneEmail {
		
		public static void main(String []args){
		
				InputStreamReader input = new InputStreamReader(System.in);
				BufferedReader tastiera = new BufferedReader(input);
			
				//iStanza dell'oggetto
				Email email = new (Email);
		
				//Variabili
				String sceltauno;
				String emails[100];
				int scelta;
			
			
			do {
				
				System.out.println("Premi 1 per inserire l'email");
				System.out.println("Premi 2 per visualizzare l'email");
				System.out.println("Premi 3 per uscire dal menu'");
				try{
					sceltauno = tastiera.readLine();
					scelta = Int.valueOf(sceltauno).intValue();
				} catch (Exception a) {
					System.out.println("Scelta non inserita correttamente. Ritenta");
				}
				
				switch(scelta){
				
					case 1:
				
						email.setDestinatario(destinatario);
						email.setMittente(mittente);
						email.setOggetto(oggetto);
						email.setTesto(testo);
		
					break;
				
					case 2:
				
					email.getDestinatario();
					email.getMittente();
					email.getOggetto();
					email.getTesto();
					System.out.println("Destinatario: " + destinatario);
					System.out.println("Mittente: " + mittente);
					System.out.println("Oggetto: " + oggetto);
					System.out.println(" " + testo);
				
					break;
				
					default:
				
					System.out.println("Scelta non disponibile. Ritenta");
				
					break;
				}
			
			} (While scelta != 3);

		}
	}